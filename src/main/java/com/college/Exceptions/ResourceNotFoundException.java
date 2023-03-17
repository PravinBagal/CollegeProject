package com.college.Exceptions;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {
    public ResourceNotFoundException(String msg)
    {
        super(msg);
    }

}
