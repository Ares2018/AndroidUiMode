package com.aliya.uimode.simple;

import android.os.Bundle;
import android.view.View;

import com.aliya.uimode.simple.base.BaseActivity;

/**
 * 示例页
 *
 * @author a_liYa
 * @date 2018/2/4 下午4:54.
 */
public class SimpleActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_tab:
                if (v.isSelected()) {
                    v.setSelected(false);
                    v.setEnabled(false);
                } else {
                    if (v.isEnabled()) {
                        v.setSelected(true);
                    } else {
                        v.setEnabled(true);
                    }
                }
                break;
        }
    }

}
