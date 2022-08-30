package assign1_template;

public class Undergraduate extends Student {

    //2.1.2 Add the code for tasks below
    //add new data fields: generalEduAdvisor, majorAdvisor
    private String generalEduAdvisor;
    private String majorAdvisor;

    // Empty constructor (no default vals)
    public Undergraduate(){
    }
    // regular constructor
    public Undergraduate(String id, String firstName, String lastName, String major, String degree, double gpa, String generalEduAdvisor, String majorAdvisor){
        super(id, firstName, lastName, major, degree, gpa);
        this.generalEduAdvisor = generalEduAdvisor;
        this.majorAdvisor = majorAdvisor;
    }

    public String getGeneralEduAdvisor() {
        return generalEduAdvisor;
    }
    public void setGeneralEduAdvisor(String generalEduAdvisor) {
        this.generalEduAdvisor = generalEduAdvisor;
    }
    public String getMajorAdvisor() {
        return majorAdvisor;
    }
    public void setMajorAdvisor(String majorAdvisor) {
        this.majorAdvisor = majorAdvisor;
    }

    //typical toString method to easily display fields of this class.
    @Override
    public String toString() {
       return "id: " + this.getId() + ", firstName: " + this.getFirstName() + 
       ", lastName: " + this.getLastName() + ", major: " + this.getMajor() + 
       ", degree: " + this.getDegree() + ", gpa: " + this.getGpa() + 
       ", generalEduAdvisor: " + generalEduAdvisor + ", majorAdvisor: " + majorAdvisor;
    }

}
