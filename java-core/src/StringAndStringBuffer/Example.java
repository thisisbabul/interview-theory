package StringAndStringBuffer;

public class Example {
    public static void main(String[] args) {
        //String
        String name = new String("Babul");
        name.concat("Miah");
        System.out.println(name);

        //StringBuffer
        StringBuffer stringBuffer = new StringBuffer("Babul");
        stringBuffer.append("Miah");
        System.out.println(stringBuffer);

        //StringBuilder
        StringBuilder stringBuilder = new StringBuilder("Babul");
        stringBuilder.append("Miah");
        System.out.println(stringBuilder);
    }
}
