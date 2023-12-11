package pl.pingvit.homework20;
public class GenericClass<T> {
    private T item;
    public GenericClass(T item) {
        this.item = item;
    }
    public String getType(){
        return item.getClass().getName();
    }
}
