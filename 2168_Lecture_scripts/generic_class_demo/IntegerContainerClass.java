package generic_class_demo;


public class IntegerContainerClass {
    private Integer data;
    
    public IntegerContainerClass(){       
    }
    
    public IntegerContainerClass(Integer data){
        this.data = data;
    }   
    
    public void setData(Integer data){ //new Integer(50)
        this.data = data;
    }   
    
    public Integer getData(){
        return data;
    }
    
    @Override //class Object
    public String toString(){
        return data.toString();
    }
}
