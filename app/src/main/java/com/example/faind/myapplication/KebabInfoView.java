package com.example.faind.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

class KebabInfoView extends LinearLayout {
    public KebabInfoView(Context context) {
        super(context);
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(context).inflate(R.layout.label_kebab, this, true);

    }

    public KebabInfoView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        setOrientation(LinearLayout.VERTICAL);
        LayoutInflater.from(context).inflate(R.layout.label_kebab, this, true);
    }


    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
    }
}
