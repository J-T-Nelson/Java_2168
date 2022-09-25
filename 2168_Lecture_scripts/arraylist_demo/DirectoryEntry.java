package arraylist_demo;

public class DirectoryEntry {
    private String name;
    private String number;

    public DirectoryEntry(String name,
            String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }
    
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    @Override
    public String toString() {
        return "name: " + name + ", phone number: " + number;
    }
    
    //equals other   
    public boolean equals(DirectoryEntry other) {
        return false;
    }
    
    
}
