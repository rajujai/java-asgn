package com.raju.q3;

public class DiskCoreDataManager implements DataManager{

    @Override
    public void read() {
        System.out.println("Reading DiskCoreDataManager");
    }

    @Override
    public void write() {
        System.out.println("Saving Into Realm");
    }
}
