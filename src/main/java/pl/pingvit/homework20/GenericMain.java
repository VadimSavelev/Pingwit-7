package pl.pingvit.homework20;
public class GenericMain {

    // плиз отформатируй код. перед первым Syste.out... можно сделать пустую строку, чтобы логически отделить блок
    public static void main(String[] args) {
       GenericClass<String> stringGenericClass=new GenericClass<>("opopo");
       GenericClass<Integer> integerGenericClass=new GenericClass<>(43);
       GenericClass<?> genericClass = new GenericClass<>(4.6);
        System.out.println(stringGenericClass.getType());
        System.out.println(integerGenericClass.getType());
        System.out.println(genericClass.getType());
    }
}
