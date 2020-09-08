package Library;

import day50_Inheritance_Overriding.AccessModifiers;
import day50_Inheritance_Overriding.Test;

public class InheritanceTest extends AccessModifiers {

    public static void main(String[] args) {
        System.out.println(publicData);  // public is visible outside package
        System.out.println(InheritanceTest.protectedData); // protected is visible always visible to its sub class
       // System.out.println(InheritanceTest.defaultData);  // default is not visible outside package
       // System.out.println(InheritanceTest.privateData);
    }




}
