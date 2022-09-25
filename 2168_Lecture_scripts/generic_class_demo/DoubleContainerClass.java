
package generic_class_demo;


public class DoubleContainerClass {
    private Double data;
    
    public DoubleContainerClass(){       
    }
    
    public DoubleContainerClass(Double data){
        this.data = data;
    }   
    
    public void setData(Double data){
        this.data = data;
    }   
    
    public Double getData(){
        return data;
    }
    
    @Override
    public String toString(){
        return data.toString();
    }
}
