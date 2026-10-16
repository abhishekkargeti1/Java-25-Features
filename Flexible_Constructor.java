// Now super should  not be the first statement in the constructor of child class.
// Before Super we cannot user this statement 

class Parent {
    Parent(int age) {
        System.out.println("Age: " + age);
    }
}

class Flexible_Constructor extends Parent {
    Flexible_Constructor(int age) {   // Prologue Statement
        if (age < 0) {
            throw new IllegalArgumentException("Invalid age");
        }

        super(age);
        System.out.println("Child constructor");   // Epilogue Statement
    }
}
