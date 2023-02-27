# Quick start

Use the Rupt APIs in your Android app to manage user devices with ease.

### Installation

1. Add the JitPack repository to your build file
   ```groovy
   allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
   ```
2. Add the dependency
   ```
   dependencies { implementation 'com.github.getrupt:kotlin:2.1.0' }
   ```

### Usage

3. Configure the SDK as soon as your app launches.

   ```kotlin
   // REQUIRED
   Sabil.configure(this, "<#client id#>")
   ```

4. Attach the device to the user or identify the device without a user.

   ```kotlin
   // Set this as soon as the user ID is available and attach the device.
   Rupt.userId = "<#user id#>"
   Rupt.attach(supportFragmentManager) {
    Toast.makeText(this, "Attached. Device Id -> ${Rupt.deviceId}", Toast.LENGTH_LONG).show()
   }
   ```

   If the user can perform actions on your app without login, use the `identify` method instead.
   Both `attach` and `identify` accept metadata

   ```kotlin
   Rupt.identify {
    Log.d("Rupt", "Device identified. Identity: ${it?.identity}")
   }
   ```

   Ensure you call the `attach` or `identify` when the app enters the foreground state as well.

5. (Optional) Implement the callbacks. These are useful depending on your use-case. For account
   sharing prevention, for example, you should implement the `onCurrentDeviceLogout`
   and `onLimitExceeded` callbacks.

   ```kotlin
   Rupt.onLogoutCurrentDevice = {
       // logout the current device
   }

   Rupt.onLimitExceeded = {
       // the user has too many devices using their account
   }
   ```
