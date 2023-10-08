package com.ihasan.imrul.model;

public enum DeviceType {
    DESKTOP("Personal computer"),
    MOBILE("Smartphone"),
    TABLET("Tablet");

    private final String description;

    private DeviceType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    
    // not being used 
    public String getDeviceName(String description){
        for(DeviceType device : DeviceType.values()){
            if (DeviceType.DESKTOP.getDescription().equals(device.getDescription())){
                return DeviceType.DESKTOP.toString();
            }
            if (DeviceType.TABLET.getDescription().equals(device.getDescription())){
                return DeviceType.TABLET.toString();
            }
            if (DeviceType.MOBILE.getDescription().equals(device.getDescription())){
                return DeviceType.MOBILE.toString();
            }
            return null;
        }
        return null;
    }
}
