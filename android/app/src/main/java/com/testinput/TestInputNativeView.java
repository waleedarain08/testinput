package com.testinput;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.uimanager.ThemedReactContext;

public class TestInputNativeView extends LinearLayout {

    ThemedReactContext mContext;
    EditText editText;
    TextView tv;

    public TestInputNativeView(ThemedReactContext context) {
        super(context);
        this.mContext = context;
        init();
    }

    private void init() {
        inflate(mContext, R.layout.input_layout, this);

        editText = findViewById(R.id.et);
        tv = findViewById(R.id.tv);

        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                tv.setText(editable.toString());
                mContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).
                        emit("custom_event", editable.toString());
            }
        });


    }


}
