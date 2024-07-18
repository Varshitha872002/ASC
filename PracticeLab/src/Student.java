public class Student {
    public int Student_Id;
    public String Student_name;
    public String City;
    public int Marks1;
    public int Marks2;
    public int Marks3;
    public float feeperMonth;
    public boolean isEligibleForScholarship;

    public Student(int Student_Id,String Student_name, String City, int Marks1, int Marks2, int Marks3,float feeperMonth, boolean isEligibleForScholarship) {
        this.Student_Id = Student_Id;
        this.Student_name = Student_name;
        this.City = City;
        this.Marks1 = Marks1;
        this.Marks2 = Marks2;
        this.Marks3 = Marks3;
        this.feeperMonth = feeperMonth;
        this.isEligibleForScholarship = isEligibleForScholarship;
    }

    public int getAnnualFee() {
        return (int) (feeperMonth * 12);
    }
    public int getTotalmarks() {
        return (Marks1 + Marks2 + Marks3);
    }
    public double getAverage() {
        return ((Marks1 + Marks2 + Marks3) / 3.0);
    }
    public String getResult() {
        return (Marks1 > 60 && Marks2 > 60 && Marks3 > 60) ? "pass" : "fail";
    }
    public String getScholarship() {
        return isEligibleForScholarship ? "Eligible" : "Not Eligible";
    }
}
