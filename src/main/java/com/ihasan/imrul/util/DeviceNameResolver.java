package com.ihasan.imrul.util;

import com.ihasan.imrul.model.DeviceType;

public class DeviceNameResolver {

    public String getDeviceName(String description){
        if (DeviceType.DESKTOP.getDescription().equals(description)){
            return DeviceType.DESKTOP.toString();
        }
        if (DeviceType.TABLET.getDescription().equals(description)){
            return DeviceType.TABLET.toString();
        }
        if (DeviceType.MOBILE.getDescription().equals(description)){
            return DeviceType.MOBILE.toString();
        }
        return null;
    }
    
}
