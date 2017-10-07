package io.young.springboot.exception;

public class EmployeeException extends RuntimeException {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
