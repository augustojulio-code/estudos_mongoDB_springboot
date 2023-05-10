package com.springmongo.springmongo.services;

public class ObjectNotFoundExecption extends RuntimeException {

    public ObjectNotFoundExecption(String msg) {
        super(msg);
    }

}
