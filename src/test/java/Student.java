import java.util.Scanner;
public class Student {

    private String firstName;
    private String lastName;
    private int batchNo;
    private boolean isOnCampus;
    private String studentId;
    private String subjects;
    private final String school_name = "DUO TECH";
    private double tuitionBalance;
    private int numberOfStudentsCreated=0;
    private int randomThreeDigit;

    public Student() {

    }

    public Student(String firstName, String lastName, int batchNo, boolean isOnCampus, String studentId, String subjects, double tuitionBalance, int numberOfStudentsCreated, int randomThreeDigit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.batchNo = batchNo;
        this.isOnCampus = isOnCampus;
        this.studentId = studentId;
        this.subjects ="Java,HTML,Selenium,Cucumber,RestAssured,SQL";
        this.tuitionBalance = tuitionBalance=0;
        this.numberOfStudentsCreated = numberOfStudentsCreated=0;
        this.randomThreeDigit = randomThreeDigit=(int)(Math.random()*1000);
    }

    public void generateStudentId() {
        tuitionBalance=5000;
        if(isOnCampus) {

        }else{
            tuitionBalance=4000;
        }
    }
    public String generateStudentID() {

        char firstChar = firstName.charAt(0);
        char lastChar = lastName.charAt(lastName.length()-1);
        String randomTreeDigitStr=Integer.toString(randomThreeDigit);
        String studentId=firstChar+lastChar+batchNo+randomTreeDigitStr;
        return studentId;
    }
    public String getStudentInfo() {
        String studentInfo="";
        studentInfo+="Student: "+firstName+" "+lastName+"\n";
        studentInfo="Schoole: "+school_name+"\n";
        studentInfo+=" Batch: "+batchNo+"\n";
        studentInfo+=" On Campus: "+isOnCampus+"\n";
        studentInfo+=" Student Id: "+studentId+"\n";
        studentInfo+=" Subjects: "+subjects+"\n";
        studentInfo+=" Tuition Balance: "+tuitionBalance+"\n";
        return studentInfo;
    }
    public String getSubjecs() {
        return subjects;
    }




}




