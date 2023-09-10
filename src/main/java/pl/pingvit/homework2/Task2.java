package pl.pingvit.homework2;

public class Task2 {
    public static void main(String[] args) {
        String myByteString = "77";
        // опечатка: myParsedByte, без буквы n. это касается и остальных переменных
        // переименуй из через refactor -> rename
        Byte myParsedByte = Byte.parseByte(myByteString);
        String myShortString = "12587";
        Short myParsedShort = Short.parseShort(myShortString);
        String myIntString = "-78945627";
        Integer myParsedInt = Integer.parseInt(myIntString);
        String myFloatString = "123.6789";
        Float myParsedFloat = Float.parseFloat(myFloatString);
        String myDoubleString = "-8965.876655";
        Double myParsedDouble = Double.parseDouble(myDoubleString);
        System.out.println(myParsedByte);
        System.out.println(myParsedShort);
        System.out.println(myParsedInt);
        System.out.println(myParsedFloat);
        System.out.println(myParsedDouble);
    }
}
