public class Student extends Person {
    private int studentCredits;

    public Student(String name, String address) {
        super(name, address);
        studentCredits = 0;
    }

    public void study() {
        studentCredits = studentCredits + 1;
    }

    public int credits() {
        return studentCredits;
    }

    @Override
    public String toString() {
        return super.getName() + "\n  " + super.getAddress() + "\n  " + "Study credits " + credits();
    }
}
