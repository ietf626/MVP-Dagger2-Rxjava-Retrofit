package com.example.arron.demo.view.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.arron.demo.R;


/**
 * Created by Arron on 16/6/30.
 */
public class HomeItemTextView extends TextView {
    private Animation shrink_anim;
    private Animation expand_anim;
    private MainPageItemView.OnActionUpListener onActionUpListener;
    private int pos;

    public HomeItemTextView(Context context) {
        this(context, null);
    }

    public HomeItemTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public HomeItemTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initAnim();
    }

    private void initAnim() {
        shrink_anim = AnimationUtils.loadAnimation(getContext(), R.anim.home_item_anim_shrink);
        shrink_anim.setFillAfter(true);
        expand_anim = AnimationUtils.loadAnimation(getContext(), R.anim.home_item_anim_expand);
        expand_anim.setFillAfter(true);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                this.startAnimation(shrink_anim);
                break;
            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                this.startAnimation(expand_anim);
                if (null != onActionUpListener) {
                    onActionUpListener.onActionUp(this, pos);
                }
                break;
        }
        return super.onTouchEvent(event);
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public void setOnActionUpListener(MainPageItemView.OnActionUpListener onActionUpListener) {
        this.onActionUpListener = onActionUpListener;
    }
}