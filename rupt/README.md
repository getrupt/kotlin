# Sabil Android SDK

This is the official Kotlin library for [Rupt](https://www.rupt.dev). Use this library to monitor
and prevent account sharing or manage user devices in general.

## Installation

1. Add the JitPack repository to your build file
   ```
   allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
   ```
2. Add the dependency
   ```
   dependencies { implementation 'com.github.sabil-io:rupt:2.1.0' }
   ```