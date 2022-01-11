# JAVA
**Differences between String & StringBuffer & StringBuilder?**

    //String
    1. Immutable
    2. Example
        String name = new String("Babul");
        name.concat("Miah"); //garbage
        System.out.println(name);
        //output
        Babul

    //StringBuffer
    1. Mutable
    2. Thread Safe
    3. Example
        StringBuffer stringBuffer = new StringBuffer("Babul");
        stringBuffer.append("Miah");
        System.out.println(stringBuffer);
        //output
        BabulMiah

    //StringBuilder
    1. Mutable
    2. No Thread safe //multi thread allowed
    3. Example
        StringBuilder stringBuilder = new StringBuilder("Babul");
        stringBuilder.append("Miah");
        System.out.println(stringBuilder);

**Difference between "== operator" & "equals" method?**
    
    //== operator
    reference or address comparism

    //equals method
    content comparism

**Object**

    Any entity that has state and behavior is known as an Object

**Class**

    Collection of objects is called class.

**Inheritance**

    - Accessing & updating existing object functionality
    - Adding new features

**Polymorphism**

    If one task is performed in different ways.
    Example: Method overloading & overriding.

**Abstraction**
    
    Hiding internal details & showing functionality is known as abstraction.
    Example: Abstract class & Interface.

**Interface**
    
    100% data abstraction

**Abstract class**
    
    Partial implemenation of object

**Encapsulation**

    Binding code & data together into a single unit is known as encapsulation
    Example: Java bean

**Concrete class**

    100% implemenation of object

**Overloading**

    - Method name must be same
    - Method argument types must different (at least order)
    - Private, static & final method can be overloaded
    - Compile time polymorphism

**Overriding**
    
    - Method name must be same
    - Method argument types must be same (including order)
    - Private, static & final method can not be overriden
    - Runtime polymorphism

**Check exception**

    1. Compile-time exception
    2. Java app connected to outer resource // handling is mandatory
    3. Example
        - IOException
        - FileNotFoundException
        - SQLException

**Uncheck Exception**

    1. Runtime exception
    2. Java app not connected to outer resource // handling is optional
    3. Example
        - ArithmaticException
        - ArrayIndexOutOfBoundException
        - NumberFormationException
        - NullPointerException

**Transient variable**

    ignore that type of variable to serialize