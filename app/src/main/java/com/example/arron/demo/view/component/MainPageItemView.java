package com.example.arron.demo.view.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import com.example.arron.demo.R;


/**
 * Created by Arron on 16/6/29.
 */
public class MainPageItemView extends LinearLayout {
    private HomeItemTextView tv_left;
    private HomeItemTextView tv_middle_top;
    private HomeItemTextView tv_middle_bottom;
    private HomeItemTextView tv_right_top;
    private HomeItemTextView tv_right_bottom;
    private onLeftClickListener onLeftClickListener;
    private onMiddleBottomClickListener onMiddleBottomClickListener;
    private onMiddleTopClickListener onMiddleTopClickListener;
    private onRightBottomClickListener onRightBottomClickListener;
    private onRightTopClickListener onRightTopClickListener;


    public MainPageItemView(Context context) {
        this(context, null);
    }

    public MainPageItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MainPageItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view = View.inflate(getContext(), R.layout.home_item, this);
        initView(view);
        setListener();
        bindAttrs(context, attrs);
    }

    private void setListener() {
        tv_left.setOnActionUpListener(new OnActionUpListener() {
            @Override
            public void onActionUp(View v, int pos) {
                if (null != onLeftClickListener)
                    onLeftClickListener.onActionUp(v, pos);
            }
        });
        tv_middle_bottom.setOnActionUpListener(new OnActionUpListener() {
            @Override
            public void onActionUp(View v, int pos) {
                if (null != onMiddleBottomClickListener)
                    onMiddleBottomClickListener.onActionUp(v, pos);
            }
        });
        tv_middle_top.setOnActionUpListener(new OnActionUpListener() {
            @Override
            public void onActionUp(View v, int pos) {
                if (null != onMiddleTopClickListener)
                    onMiddleTopClickListener.onActionUp(v, pos);
            }
        });
        tv_right_top.setOnActionUpListener(new OnActionUpListener() {
            @Override
            public void onActionUp(View v, int pos) {
                if (null != onRightTopClickListener)
                    onRightTopClickListener.onActionUp(v, pos);
            }
        });
        tv_right_bottom.setOnActionUpListener(new OnActionUpListener() {
            @Override
            public void onActionUp(View v, int pos) {
                if (null != onRightBottomClickListener)
                    onRightBottomClickListener.onActionUp(v, pos);
            }
        });
    }

    private void bindAttrs(Context context, AttributeSet attrs) {
        TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.HomeItemView);
        int textColor = typedArray.getColor(R.styleable.HomeItemView_textColor, Color.WHITE);
        float textSize = typedArray.getFloat(R.styleable.HomeItemView_title_textSize, 15);
        int left_bg = typedArray.getResourceId(R.styleable.HomeItemView_left_background, 0);
        int middle_top_bg = typedArray.getResourceId(R.styleable.HomeItemView_middle_top_background, 0);
        int middle_bottom_bg = typedArray.getResourceId(R.styleable.HomeItemView_middle_bottom_background, 0);
        int right_top_bg = typedArray.getResourceId(R.styleable.HomeItemView_right_top_background, 0);
        int right_bottom_bg = typedArray.getResourceId(R.styleable.HomeItemView_right_bottom_background, 0);

        CharSequence left_text = typedArray.getText(R.styleable.HomeItemView_left_text);
        CharSequence middle_top_text = typedArray.getText(R.styleable.HomeItemView_middle_top_text);
        CharSequence middle_bottom_text = typedArray.getText(R.styleable.HomeItemView_middle_bottom_text);
        CharSequence right_top_text = typedArray.getText(R.styleable.HomeItemView_right_top_text);
        CharSequence right_bottom_text = typedArray.getText(R.styleable.HomeItemView_right_bottom_text);

        tv_left.setTextColor(textColor);
        tv_middle_top.setTextColor(textColor);
        tv_middle_bottom.setTextColor(textColor);
        tv_right_bottom.setTextColor(textColor);
        tv_right_top.setTextColor(textColor);

        tv_left.setTextSize(textSize);
        tv_middle_bottom.setTextSize(textSize);
        tv_middle_top.setTextSize(textSize);
        tv_right_bottom.setTextSize(textSize);
        tv_right_top.setTextSize(textSize);

        tv_left.setText(left_text);
        tv_middle_top.setText(middle_top_text);
        tv_middle_bottom.setText(middle_bottom_text);
        tv_right_top.setText(right_top_text);
        tv_right_bottom.setText(right_bottom_text);

        tv_left.setBackgroundResource(left_bg);
        tv_middle_top.setBackgroundResource(middle_top_bg);
        tv_middle_bottom.setBackgroundResource(middle_bottom_bg);
        tv_right_top.setBackgroundResource(right_top_bg);
        tv_right_bottom.setBackgroundResource(right_bottom_bg);

        tv_left.setPos(0);
        tv_middle_top.setPos(1);
        tv_middle_bottom.setPos(2);
        tv_right_top.setPos(3);
        tv_right_bottom.setPos(4);

    }

    private void initView(View view) {
        tv_left = (HomeItemTextView) view.findViewById(R.id.left);
        tv_middle_top = (HomeItemTextView) view.findViewById(R.id.middle_top);
        tv_middle_bottom = (HomeItemTextView) view.findViewById(R.id.middle_bottom);
        tv_right_top = (HomeItemTextView) view.findViewById(R.id.right_top);
        tv_right_bottom = (HomeItemTextView) view.findViewById(R.id.right_bottom);
    }

    public void setOnLeftClickListener(MainPageItemView.onLeftClickListener onLeftClickListener) {
        this.onLeftClickListener = onLeftClickListener;
    }

    public void setOnMiddleBottomClickListener(MainPageItemView.onMiddleBottomClickListener onMiddleBottomClickListener) {
        this.onMiddleBottomClickListener = onMiddleBottomClickListener;
    }

    public void setOnMiddleTopClickListener(MainPageItemView.onMiddleTopClickListener onMiddleTopClickListener) {
        this.onMiddleTopClickListener = onMiddleTopClickListener;
    }

    public void setOnRightBottomClickListener(MainPageItemView.onRightBottomClickListener onRightBottomClickListener) {
        this.onRightBottomClickListener = onRightBottomClickListener;
    }

    public void setOnRightTopClickListener(MainPageItemView.onRightTopClickListener onRightTopClickListener) {
        this.onRightTopClickListener = onRightTopClickListener;
    }

    public interface OnActionUpListener {
        void onActionUp(View v, int pos);
    }

    public interface onLeftClickListener extends OnActionUpListener {
    }

    public interface onMiddleTopClickListener extends OnActionUpListener {
    }

    public interface onMiddleBottomClickListener extends OnActionUpListener {
    }

    public interface onRightTopClickListener extends OnActionUpListener {
    }

    public interface onRightBottomClickListener extends OnActionUpListener {
    }
}
