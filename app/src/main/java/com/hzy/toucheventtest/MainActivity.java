package com.hzy.toucheventtest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Log.e("MainActivity-TouchEvent", "onTouchEvent");
        return super.onTouchEvent(ev);
    }


    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("MainActivity-TouchEvent", "dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);  //super 事件往下传递至ViewGroup的dispatchTouchEvent
//        return true; //返回true  事件消费，不再往下执行
//        return false;//返回false 事件消费，不再往下执行
    }
}
