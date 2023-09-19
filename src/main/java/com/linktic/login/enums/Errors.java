package com.linktic.login.enums;

public enum Errors {

    NO_USER_EXIST("Usuario y/o contraseña incorrectos"),
	USER_PASSWORD_INCORRECT("Los datos ingresados son inválidos. Intente nuevamente");

    private String error;

    Errors(String error) {
        this.error = error;
    }
    
    public String getError() {
    	return this.error;
    }

}
