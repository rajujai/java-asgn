package com.raju.q3;

public class DiskRealmManager implements DataManager{

    @Override
    public void read() {
        System.out.println("Reading DiskRealmManager");
    }

    @Override
    public void write() {
        System.out.println("Saving Into Realm");
    }
}
