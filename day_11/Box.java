package day_11;
public class Box<T>{
    T Container;

    //constructor
    
    public Box(T Container){
        this.Container= Container;

    }
    public Object getValue(){
        return this.Container;
    }
}