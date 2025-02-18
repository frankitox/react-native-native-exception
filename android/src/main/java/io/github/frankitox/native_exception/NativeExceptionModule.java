package io.github.frankitox.native_exception;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class NativeExceptionModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public NativeExceptionModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "NativeException";
    }

    @ReactMethod
    public void raiseNativeError() throws Exception {
      throw new Exception("EXCEPTION ON ANDROID");
    }

    @ReactMethod
    public void raiseNativeError(String message) throws Exception {
      throw new Exception(message);
    }
}
