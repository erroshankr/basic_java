package com.java.interface_demo;

//1. 'interface' : keyword is used to identify/create interfaces.
//2. 'implements' : keyword is used
//3. all methods in interface is by-default public & abstract.
//4. all variables in interface are by-default: public, static & final
//5. Interface can not be instantiated-> can not make object.
public interface Manager {

    String name="Rakesh";
    void displayName();
    void displayRole();
}
