package com.tmobile.widget;

import com.android.internal.R;
import com.tmobile.widget.Carousel.CarouselViewAdapter;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;


public class CarouselTabContentLayout extends FrameLayout  {

	private CarouselLayout mCarouselLayout;

	private int mScrollDuration = SCROLL_DURATION_DEFAULT;
	private static final int SCROLL_DURATION_DEFAULT = 400;
	
	public CarouselTabContentLayout(Context context) {
		this(context, null, 0);
	}

	public CarouselTabContentLayout(Context context, AttributeSet attrs) {
		this(context, attrs, 0);
	}

	public CarouselTabContentLayout(Context context, AttributeSet attrs,
			int defStyle) {
		super(context, attrs, defStyle);

		setFocusable(false);
		               
		setFocusableInTouchMode(false);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.Gallery, defStyle, 0);
        mScrollDuration = a.getInt(R.styleable.Gallery_animationDuration, SCROLL_DURATION_DEFAULT);
        a.recycle();
		
		mCarouselLayout = new CarouselLayout(context, attrs, defStyle);
		
		mCarouselLayout.setScrollDuration(mScrollDuration);
		
		LayoutParams layoutParams = generateDefaultLayoutParams();
		
		// The height of filmstrip is 50, hence set the y padding to 50
		setPadding(0, 50, 0, 0);
		super.addView(mCarouselLayout, -1, layoutParams);
	}
	
	public void setSelection(int position, boolean animate) {
		mCarouselLayout.setSelection(position, animate);
    }
	
	public void setAdapter(CarouselViewAdapter adapter) {
		mCarouselLayout.setAdapter(adapter);
	}

	@Override
	public void addView(View child, int width, int height) {
		// Do nothing
	}

	@Override
	public void addView(View child, int index,
			android.view.ViewGroup.LayoutParams params) {
		// Do nothing
	}

	@Override
	public void addView(View child, int index) {
		// Do nothing
	}

	@Override
	public void addView(View child, android.view.ViewGroup.LayoutParams params) {
		// Do nothing
	}

	@Override
	public void addView(View child) {
		// Do nothing
	}

	@Override
	public void removeAllViews() {
		// Do nothing
	}

	@Override
	public void removeAllViewsInLayout() {
		// Do nothing
	}

	
	@Override
	public void removeView(View view) {
		// Do nothing
	}

	@Override
	public void removeViewAt(int index) {
		// Do nothing
	}

	@Override
	public void removeViewInLayout(View view) {
		// Do nothing
	}

	@Override
	public void removeViewsInLayout(int start, int count) {
       // Do nothing
	}

	
	@Override
	public void removeViews(int start, int count) {
		// Do nothing
	}
	
	public int getSelectedPosition() {
		return mCarouselLayout.getSelectedPosition();
	}
	
	public void setSelection(int position) {
		mCarouselLayout.setSelection(position, true);
	}
	
}
