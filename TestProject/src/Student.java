public class Student {
    public int S_Id;
    public String S_Name;
    public String city;
    public int marks1;
    public int marks2;
    public int marks3;
    public float feePerMonth;
    public boolean isEligibleForScholarship;

    public Student(int S_Id, String S_Name, String city, int marks1, int marks2, int marks3, float feePerMonth, boolean isEligibleForScholarship) {
        this.S_Id = S_Id;
        this.S_Name = S_Name;
        this.city = city;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
        this.feePerMonth = feePerMonth;
        this.isEligibleForScholarship = isEligibleForScholarship;
    }

    public int getAnnualFee() {
        return (int) (feePerMonth * 12);
    }
    public int getTotalmarks() {
        return marks1 + marks2 + marks3;
    }
    public double getAverage() {
        return getTotalmarks() / 3.0;
    }
    public String getResult() {
        return (marks1 > 60 && marks2 > 60 && marks3 > 60) ? "pass" : "fail";
    }
    public String getScholarshipStatus() {
        return isEligibleForScholarship ? "Scholarship available" : "Scholarship not available";
    }
}
