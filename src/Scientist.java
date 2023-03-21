public class Scientist {
    private String degree;
    private String school;

    public Scientist(String degree, String school) {
        this.degree = degree;
        this.school = school;
    }

    public void useScientificMethod() {
        System.out.println("I always use the Scientific Method");
    }

    public String getDegree() {
        return degree;
    }

    public String getSchool() {
        return school;
    }
}
