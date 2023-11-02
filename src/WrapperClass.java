import java.math.BigInteger;

public class WrapperClass {
    // Wrapper class = provides a way to use primitive data types as ref data types
    //                  ref data types contain useful methods to be used with collections
    //primitive  //wrapper
    //---------  //-------
    // boolean  Boolean
    // char   Character
    // int   Integer
    // double  Double

    // autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
    // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

    public static void main(String[] args){
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "String";

        BigInteger x = new BigInteger("39183182382138123821831");
        BigInteger j = new BigInteger("2");
        BigInteger z = j.multiply(x);
        System.out.println(z);

        Double o = 3.5;
        System.out.println(o.intValue()); // 3
        System.out.println(o.compareTo(4.5)); // -1

    }


}
