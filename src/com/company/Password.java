package com.company;

import java.util.regex.Pattern;

public class Password {
    private String regex;
    private String pwd;

    public Password(String regex){
        this.regex = regex;
    }

    public boolean setValue(String pwd) throws Exception {
        if(!pwd.matches(this.regex))
            throw new Exception("La contraseña no machea con el password");

        this.pwd = pwd;
        return true;
    }

}
