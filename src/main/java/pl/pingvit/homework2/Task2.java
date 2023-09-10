package pl.pingvit.homework2;

public class Task2 {
    public static void main(String[] args) {
        String myByteString = "77";
        Byte myParsendByte = Byte.parseByte(myByteString);
        String myShortString = "12587";
        Short myParsendShort = Short.parseShort(myShortString);
        String myIntString = "-78945627";
        Integer myParsendInt = Integer.parseInt(myIntString);
        String myFloatString = "123.6789";
        Float myParsenFloat = Float.parseFloat(myFloatString);
        String myDoubleString = "-8965.876655";
        Double myParsendDouble = Double.parseDouble(myDoubleString);
        System.out.println(myParsendByte);
        System.out.println(myParsendShort);
        System.out.println(myParsendInt);
        System.out.println(myParsenFloat);
        System.out.println(myParsendDouble);
    }
}
