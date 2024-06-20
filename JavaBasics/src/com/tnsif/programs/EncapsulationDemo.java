package com.tnsif.programs;

public class EncapsulationDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Encapsulation obj = new Encapsulation(); // Created an object
        // classname obj_name = new ClassName();
        obj.serialnum = 16; // Calling data member by using obj
        obj.name = "aejaz";
        obj.age = 19;
        obj.show();
    }
}
