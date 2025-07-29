package modifers_Access;

class Test6 {
    String name;
    int rollno;
    int marks;
    static String cname; // ✅ static must be lowercase

    public String getStudentInfo() {
        return name + ".." + marks;
    }

    public static String getCollegeInfo() { // ✅ corrected method name
        return cname;
    }

    public double getAverage(int x, int y) {
        return (x + y) / 2.0; // ✅ fixed logic and type
    }

    public String getCompleteInfo() {
        return name + ".." + rollno + "..." + marks + ".." + cname;
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        t.name = "Arman";
        t.rollno = 456;
        t.marks = 99;
        Test6.cname = "ABC College";

        System.out.println(t.getStudentInfo());     // Alice..99
        System.out.println(Test6.getCollegeInfo()); // ABC College
        System.out.println(t.getAverage(80, 100));   // 90.0
        System.out.println(t.getCompleteInfo());    // Arman..456...85..ABC College
    }
}