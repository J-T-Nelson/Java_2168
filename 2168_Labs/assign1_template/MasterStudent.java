package assign1_template;

import java.util.Arrays;

public class MasterStudent extends Student {

    //2.1.3 Add the code for the tasks below.
    //add new data fields: thesis, thesisAdvisor, theisCommittee
    private String thesis;
    private String thesisAdvisor;
    private String[] committee; //thesis committee, excluding thesis advisor    

    // Empty constructor (no default vals)
    public MasterStudent(){
    }
    // regular constructor 
    public MasterStudent(String id, String firstName, String lastName, String major, String degree, double gpa, String thesis, String thesisAdvisor, String[] comittee) {
        super(id, firstName, lastName, major, degree, gpa);
        this.thesis = thesis;
        this.thesisAdvisor = thesisAdvisor;
        this.committee = comittee;
    }
    
    public void setThesis(String thesis) {
        this.thesis = thesis;
    }
    public String getThesis() {
        return thesis;
    }
    public void setThesisAdvisor(String thesisAdvisor) {
        this.thesisAdvisor = thesisAdvisor;
    }
    public String getThesisAdvisor() {
        return thesisAdvisor;
    }
    public void setCommittee(String[] committee) {
        this.committee = committee;
    }
    public String[] getCommittee() {
        return committee;
    }
    
    //typical toString method which uses Arrays.toString() in order to display contents of the array field 'comittee'
    @Override
    public String toString(){
        return "id: " + this.getId() + ", firstName: " + this.getFirstName() + 
       ", lastName: " + this.getLastName() + ", major: " + this.getMajor() + 
       ", degree: " + this.getDegree() + ", gpa: " + this.getGpa() + 
       ", thesis: " + thesis + ", thesisAdvisor: " + thesisAdvisor + 
       ", comittee: " + Arrays.toString(committee);
    }
}
