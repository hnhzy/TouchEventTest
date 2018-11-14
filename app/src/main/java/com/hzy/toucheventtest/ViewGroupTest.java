package com.hzy.toucheventtest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by hzy on 2018/11/14
 **/
public class ViewGroupTest extends LinearLayout{
    public ViewGroupTest(Context context) {
        super(context);
    }

    public ViewGroupTest(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewGroupTest(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("ViewGroup-TouchEvent","dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);//super 事件往下传递至ViewGroup的onInterceptTouchEvent
//        return true;//返回true  事件消费，不再往下执行
//        return false;//返回false  事件返回、执行MainActivity-TouchEvent
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e("ViewGroup-TouchEvent","onInterceptTouchEvent");
        return super.onInterceptTouchEvent(ev);//super 事件往下传递至View的dispatchTouchEvent
//        return true;//返回true 事件拦截，执行ViewGroup的onTouchEvent
//        return false;//返回false 事件往下传递至View的dispatchTouchEvent
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e("ViewGroup-TouchEvent","onTouchEvent");
        return super.onTouchEvent(ev);//super  事件返回、执行MainActivity-TouchEvent
//        return true;//返回true  事件消费，不再往下执行
//        return false;//返回false  事件返回、执行MainActivity-TouchEvent
    }

}