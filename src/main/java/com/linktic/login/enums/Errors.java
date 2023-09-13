package com.linktic.login.enums;

public enum Errors {

    NO_USER_EXIST("Usuario y/o contraseña incorrectos");

    private String error;

    Errors(String error) {
        this.error = error;
    }

}
