package linkedlist_1objtype;

/**
 * The class Magazine.
 * An object of this class represents a single magazine.
 * @author Cindy
 */
public class Magazine {
    
    private String title;   //magazine title
    private String editor;  //meaning: editor in chief

    //Constructor: create a Magazine object with a given title and a given editor
    public Magazine(String title, String editor) {
        this.title = title;
        this.editor = editor;
    }

    //return a string containing all information about this Magazine object.
    //Override the toString() in class Object.
    @Override
    public String toString() {
        return "[Title: " + title + ", Editor: " + editor + "]";
    }

    //getters and setters for all data fields
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
