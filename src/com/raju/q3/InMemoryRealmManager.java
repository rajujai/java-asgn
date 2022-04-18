package com.raju.q3;

public class InMemoryRealmManager implements DataManager{
    @Override
    public void read() {
        System.out.println("Reading InMemoryRealmManager");
    }

    @Override
    public void write() throws DataManagerException {
        throw new DataManagerException("Exception");
    }
}
