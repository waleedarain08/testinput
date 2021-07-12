package com.testinput;


import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

import org.jetbrains.annotations.NotNull;


public class TestInputNativeViewManager extends SimpleViewManager<TestInputNativeView> {
    public static final String REACT_CLASS = "TestInputNativeView";
    ReactApplicationContext mCallerContext;

    public TestInputNativeViewManager(ReactApplicationContext reactContext) {
        mCallerContext = reactContext;
    }

    @NonNull
    @NotNull
    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @NonNull
    @NotNull
    @Override
    protected TestInputNativeView createViewInstance(@NonNull @NotNull ThemedReactContext reactContext) {
        return new TestInputNativeView(reactContext);
    }
}
