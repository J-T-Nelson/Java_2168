//File: IndexEntry.java
//You don't need to change this class.
//The class for an index entry in the index tree for the Movie Database.

package Lab_7;

public class IndexEntry implements Comparable<IndexEntry> {
    
    
    private String title;
    private int location; //index in the list movieDB
    
    @Override
    public int compareTo(IndexEntry other) {
        return title.compareTo(other.title);
    }

    public IndexEntry(String title, int location) {
        this.title = title;
        this.location = location;
    }

    @Override
    public String toString() {
        return "IndexEntry{" + "title=" + title + ", location=" + location + '}';
    }

    public String getTitle() {
        return title;
    }
    public int getLocation() {
        return location;
    }
    public void setLocation(int location) {
        this.location = location;
    }
}
