class Course {
    static void details(CourseName course) {
        if (course == CourseName.JAVA) {
            System.out.println("The fees for " + course + " is 10000");
        } else if (course == CourseName.SQL) {
            System.out.println("The fees for " + course + " is 20000");
        } else if (course == CourseName.DEVOPS) {
            System.out.println("The fees for " + course + " is 30000");
        } else if (course == CourseName.AIML) {
            System.out.println("The fees for " + course + " is 25000");
        } else if (course == CourseName.CLOUD) {
            System.out.println("The fees for " + course + " is 30000");
        }
    }
}
