package com.hzy.toucheventtest;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

public class EventButton extends AppCompatButton {
    public EventButton(Context context) {
        super(context);
    }

    public EventButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public EventButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("EventButton-TouchEvent", "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);//super 事件往下传递至View的onTouchEvent
//        return  true;//返回true  事件消费，不再往下执行
//        return false;//返回false  事件返回、执行ViewGroupTest-TouchEvent
    }


    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e("EventButton-TouchEvent", "onTouchEvent");
        return super.onTouchEvent(ev);//super  事件返回、执行ViewGroupTest-TouchEvent
//        return  true;//返回true  事件消费，不再往下执行
//        return false;//返回false  事件返回、执行ViewGroupTest-TouchEvent
    }


}