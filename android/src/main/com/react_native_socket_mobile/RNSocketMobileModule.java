
package com.react_native_socket_mobile;

import android.content.Context;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class ReactNativeSocketMobileModule extends ReactContextBaseJavaModule {

  ReactApplicationContext reactContext;

  public ReactNativeSocketMobileModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "ReactNativeSocketMobile";
  }

  // startObserving
  // stopObserving
  // start(bundleId, developerId, appKey, resolver, rejecter)
  // stop(resolve, rejecter)
  // updateStatusFromDevices

  @ReactMethod
  public String start(bundleId, developerId, appKey) {
    return "TESTING 123"
  }
}