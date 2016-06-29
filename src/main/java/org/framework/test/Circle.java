package org.framework.test;

public class Circle {

    private String message;

    public void draw() {
	System.out.println("drawing circle");
    }

    public void setMessage(String message) {
	this.message = message;
    }

    public void getMessage() {
	System.out.println("Your Message : " + message);
    }

}
