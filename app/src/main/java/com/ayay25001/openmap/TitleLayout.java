package com.ayay25001.openmap;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

/**
 * Created by toothwind on 2017/7/26.
 * you can contact me at : toothwind@163.com.
 * All Rights Reserved
 */
public class TitleLayout extends LinearLayout {
    public TitleLayout(Context context) {
        super(context);
        init(context);
    }

    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public TitleLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        //参数2 选择他本身
        LayoutInflater.from(context).inflate(R.layout.title, this);
        findViewById(R.id.tv_cancel).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
        findViewById(R.id.tv_ok).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "保存", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
