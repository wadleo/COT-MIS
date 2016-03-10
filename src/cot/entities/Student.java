package cot.entities;
// Generated Mar 5, 2016 8:17:52 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Student generated by hbm2java
 */
public class Student  implements java.io.Serializable {


     private String matricule;
     private Group group;
     private String fname;
     private String lname;
     private String department;
     private String option;
     private int level;
     private String phoneNumber1;
     private String phoneNumber2;
     private String email;
     private byte[] pic;
     private Set messages = new HashSet(0);
     private Set delegations = new HashSet(0);
     private Set courseSessionsForDelegate1 = new HashSet(0);
     private Set courseSessionsForDelegate2 = new HashSet(0);
     private Detail detail;

    public Student() {
    }

	
    public Student(String matricule, String fname, String lname, String department, String option, int level, String phoneNumber1, String email) {
        this.matricule = matricule;
        this.fname = fname;
        this.lname = lname;
        this.department = department;
        this.option = option;
        this.level = level;
        this.phoneNumber1 = phoneNumber1;
        this.email = email;
    }
    public Student(String matricule, Group group, String fname, String lname, String department, String option, int level, String phoneNumber1, String phoneNumber2, String email, byte[] pic, Set messages, Set delegations, Set courseSessionsForDelegate1, Set courseSessionsForDelegate2, Detail detail) {
       this.matricule = matricule;
       this.group = group;
       this.fname = fname;
       this.lname = lname;
       this.department = department;
       this.option = option;
       this.level = level;
       this.phoneNumber1 = phoneNumber1;
       this.phoneNumber2 = phoneNumber2;
       this.email = email;
       this.pic = pic;
       this.messages = messages;
       this.delegations = delegations;
       this.courseSessionsForDelegate1 = courseSessionsForDelegate1;
       this.courseSessionsForDelegate2 = courseSessionsForDelegate2;
       this.detail = detail;
    }
   
    public String getMatricule() {
        return this.matricule;
    }
    
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public Group getGroup() {
        return this.group;
    }
    
    public void setGroup(Group group) {
        this.group = group;
    }
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getOption() {
        return this.option;
    }
    
    public void setOption(String option) {
        this.option = option;
    }
    public int getLevel() {
        return this.level;
    }
    
    public void setLevel(int level) {
        this.level = level;
    }
    public String getPhoneNumber1() {
        return this.phoneNumber1;
    }
    
    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }
    public String getPhoneNumber2() {
        return this.phoneNumber2;
    }
    
    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public byte[] getPic() {
        return this.pic;
    }
    
    public void setPic(byte[] pic) {
        this.pic = pic;
    }
    public Set getMessages() {
        return this.messages;
    }
    
    public void setMessages(Set messages) {
        this.messages = messages;
    }
    public Set getDelegations() {
        return this.delegations;
    }
    
    public void setDelegations(Set delegations) {
        this.delegations = delegations;
    }
    public Set getCourseSessionsForDelegate1() {
        return this.courseSessionsForDelegate1;
    }
    
    public void setCourseSessionsForDelegate1(Set courseSessionsForDelegate1) {
        this.courseSessionsForDelegate1 = courseSessionsForDelegate1;
    }
    public Set getCourseSessionsForDelegate2() {
        return this.courseSessionsForDelegate2;
    }
    
    public void setCourseSessionsForDelegate2(Set courseSessionsForDelegate2) {
        this.courseSessionsForDelegate2 = courseSessionsForDelegate2;
    }
    public Detail getDetail() {
        return this.detail;
    }
    
    public void setDetail(Detail detail) {
        this.detail = detail;
    }




}


