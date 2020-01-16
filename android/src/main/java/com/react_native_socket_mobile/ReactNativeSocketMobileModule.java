
package com.react_native_socket_mobile;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
// import com.socketmobile.capture.android.Capture;

public class ReactNativeSocketMobileModule extends ReactContextBaseJavaModule {
  private final ReactApplicationContext reactContext;

  public ReactNativeSocketMobileModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @ReactMethod
  public void startObserving() {
  }

  @ReactMethod
  public void stopObserving() {
  }

  @ReactMethod
  public void start(String bundleId, String developerId, String appKey) {
    // AppKey appkey = new AppKey(appKey, bundleId, developerId);

    // ConnectionCallback connectionCallback = new ConnectionCallback() {
    //   @override public void onConnectionStateChanged(ConnectionState state) {
    //       switch(state.get()) {
    //           case ConnectionState.CONNECTING:
    //               // do something or nothing
    //               break;
    //           case ConnectionState.CONNECTED:
    //               // client is now usable
    //               break;
    //           case ConnectionState.DISCONNECTING:
    //               // only called when shutting down gracefully
    //               break;
    //           case ConnectionState.DISCONNECTED:
    //               if(state.disconnectCausedByError()) {
    //                   // Handle error
    //               } else {
    //                   // Shut down normally
    //               }
    //           default:
    //               // Unreachable
    //               break;
    //       }
    //   }
    // };

    // Listener listener = new Listener();

    // CaptureClient client = new CaptureClient(appkey);
    // client.setListener(listener);
    // client.connect(connectionCallback);
  }
  
  @ReactMethod
  public void stop() {
  }
  
  @ReactMethod
  public void updateStatusFromDevices() {
  }

  @Override
  public String getName() {
    return "ReactNativeSocketMobile";
  }
}