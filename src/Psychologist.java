public class Psychologist extends Scientist {
    private boolean canHypnotize;

    public Psychologist(String degree, String school, boolean canHypnotize) {
        super(degree, school);
        this.canHypnotize = canHypnotize;
    }

    public void readMind() {
        System.out.println("I have just read your mind");
    }

    public boolean isCanHypnotize() {
        return canHypnotize;
    }
}
