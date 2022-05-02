package org.launchcode.studio7;
//8.7.5 Code the Interface

public interface OpticalDisc {
    //constant fields
    String name = "Megan";
    int discSpinMaxSpeed = 500;
    //method signatures

    void spinDisc();

    void playContents();

    void fastForward();

    void pause();

    void rewind ();
}
