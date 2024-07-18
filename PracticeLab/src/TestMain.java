public class TestMain {
    public static void main(String[] args) {
        Student Student1 = new Student(1, "Varshitha", "Vijayawada", 75, 82, 90, 5000.0f, true);
        Student Student2 = new Student(2, "Mythri", "Vizag", 62, 71, 40, 4000.0f, false);
        Student Student3 = new Student(3, "Likki", "Mangollu", 75, 85, 92, 6000.0f, true);
        Student[] Students = {Student1, Student2, Student3};
        Student HighestTotalmarks = gethighestmarks(Students);
        System.out.println(HighestTotalmarks.Student_name);
        Student LeastMonthlyFee = getLeastMonthlyfee(Students);
        System.out.println(LeastMonthlyFee.Student_name + LeastMonthlyFee.feeperMonth);

        for(Student student : Students) {
            System.out.println("\nName: " + student.Student_name);
            System.out.println("Total Marks: " + student.getTotalmarks());
            System.out.println("Average Marks: " + student.getAverage());
            System.out.println("Result: " + student.getResult());
            System.out.println("Scholarship Status: " + student.getScholarship());


        }

    }

    public static Student gethighestmarks (Student[] Students) {
        Student HighestTotalmarks = Students[0];
        for (int i = 1; i<Students.length; i++) {
            if (Students[i].getTotalmarks() > HighestTotalmarks.getTotalmarks()) {
                HighestTotalmarks = Students[i];
            }
        }
        return HighestTotalmarks;
    }

    public static Student getLeastMonthlyfee(Student[] Students){
        Student LeastMonthlyFee = Students[0];
        for(int i=1; i<Students.length; i++) {
            if(Students[i].feeperMonth > LeastMonthlyFee.feeperMonth) {
                LeastMonthlyFee = Students[i];
            }
        }
        return LeastMonthlyFee;
    }

}
