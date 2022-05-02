package org.launchcode.studio7;
//8.7.6 Code the Abstract Class
public abstract class BaseDisc {
    //Fields
    private int storageCapacity;
    private String name;
    private String discType;

    //constructor
    public Disc(int storageCapacity, String name, String discType) {
        this.storageCapacity = storageCapacity;
        this.name = name;
        this.discType = discType;
    }

    //Getters and Setters
    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }

//Custom Methods - have not thought of any shared
    //public abstract int storeData(int n1, int n2);


}
