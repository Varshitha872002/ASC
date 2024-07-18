public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Varshi", "Vijayawada", 90,95,98, 9000.0f, true);
        Student s2 = new Student(2, "Vani", "Jaggaiahpet", 80,88,88, 10000.0f, true);
        Student s3 = new Student(3, "Likki", "Mangollu", 87,58,78, 8000.0f, false);
        Student[] std = {s1, s2, s3};
        Student highestTotalMarks = getHigest(std);
        System.out.println(highestTotalMarks.S_Name);
        Student LeastMonthlyFee = getLeastMonthly(std);
        System.out.println(LeastMonthlyFee.S_Name + LeastMonthlyFee.feePerMonth);
        for (Student student : std) {
            System.out.println("\nName: " + student.S_Name);
            System.out.println("Total Marks: " + student.getTotalmarks());
            System.out.println("Average Marks: " + student.getAverage());
            System.out.println("Result: " + student.getResult());
            System.out.println("Scholarship Status: " + student.getScholarshipStatus());
        }
    }
    public static Student getHigest(Student[] std) {
        Student highestTotalMarks = std[0];
        for (int i = 1; i < std.length; i++) {
            if (std[i].getTotalmarks() > highestTotalMarks.getTotalmarks()) {
                highestTotalMarks = std[i];
            }
        }
        return highestTotalMarks;
    }

    // method to find the student with the lowest monthly fee
    public static Student getLeastMonthly(Student[] std) {
        Student LeastMonthlyFee = std[0];
        for (int i = 1; i < std.length; i++) {
            if (std[i].feePerMonth < LeastMonthlyFee.feePerMonth) {
                LeastMonthlyFee = std[i];
            }
        }
        return LeastMonthlyFee;
    }
}
