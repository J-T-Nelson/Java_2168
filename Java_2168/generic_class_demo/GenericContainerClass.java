package generic_class_demo;

//GenericContainerClass<String>
public class GenericContainerClass<T> { //T: type parameter

    private T data;

    public GenericContainerClass() {
    }

    public GenericContainerClass(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    @Override //class Object
    public String toString() {
        return data.toString();
    }
}
