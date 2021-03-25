package com.company;

public class PasswordIntermedio extends Password{

    public PasswordIntermedio(){
        super("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,16}");
    }
}
