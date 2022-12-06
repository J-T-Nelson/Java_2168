package Lab_3.assign2_template;

/**
 * This class adds a new version of equals(Object o), which compares two directory entries
 *   only based on the names, excluding phone numbers.
 * The rest of the code is the same as DirectoryEntry class.
 *
 */
public class DirectoryEntryV2 {
    /**
     * This method overrides (rewrites) the equals(Object o) in class Object.
     * It compares two directory entries only based on the name, excluding phone numbers.
     *
     * @param other the other entry to be compared
     * @return true if both entries have the same name, false otherwise.
     */

    @Override
    public boolean equals(Object other) {
        //special case handling
        if (other == null) {    //null argument
            return false;
        }

        if (this == other) {    //reference the same object, i.e. same identity
            return true;
        }

        //this object and other object are not of the same class
        if (this.getClass() != other.getClass()) {
            return false;
        }

        //general case handling
        //cast the type from Object to DirectoryEntryV2.
        DirectoryEntryV2 otherEntry = (DirectoryEntryV2) other;
        return this.name.equals(otherEntry.name);
    }

    //Below is same as DirectoryEntry class.

    // Data Fields
    /**The name of the individual represented in the entry. */
    private String name;
    /** The phone number for this individual. */
    private String number;

    // Constructor
    /**
     * Creates a new DirectoryEntry with the specified name and number
     * @param name The name of this individual
     * @number The phone number for this individual
     */
    public DirectoryEntryV2(String name,
            String number) {
        this.name = name;
        this.number = number;
    }

    //Methods
    /**
     * Retrieves the name.
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the number.
     * @return The number.
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the number to the specified value
     * @param number The new value for the number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Overrides the toString() method in Object class.
     * @return a string containing the name and phone number of the calling object.
     */
    @Override
    public String toString() {
        return "name: " + name + ", phone number: " + number;
    }
}
