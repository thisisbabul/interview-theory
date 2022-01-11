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

**Interface**
    
    100% data abstraction

**Abstract class**
    
    Partial implemenation

**Concrete class**

    100% implemenation

