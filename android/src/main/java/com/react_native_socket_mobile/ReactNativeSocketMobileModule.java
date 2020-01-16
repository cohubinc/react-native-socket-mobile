
package com.react_native_socket_mobile;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class ReactNativeSocketMobileModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public ReactNativeSocketMobileModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public String startObserving() {
    return "TESTING 123";
  }

  @ReactMethod
  public String stopObserving() {
    return "TESTING 123";
  }

  @ReactMethod
  public String start(String bundleId, String developerId, String appKey, String resolver, String rejecter) {
    return "TESTING 123";
  }
  @ReactMethod
  public String stop(String resolve, String rejecter) {
    return "TESTING 123";
  }
  @ReactMethod
  public String updateStatusFromDevices() {
    return "TESTING 123";
  }

  @Override
  public String getName() {
    return "ReactNativeSocketMobile";
  }
}