public class Biologist extends Scientist {
    private boolean studiedCancer;

    public Biologist(String degree, String school, boolean studiedCancer) {
        super(degree, school);
        this.studiedCancer = studiedCancer;
    }

    public void lookAtMicroscope() {
        System.out.println("Wow everything is so microscopic");
    }

    public boolean isStudiedCancer() {
        return studiedCancer;
    }
}
