public class Process {
    
    private Student student;
    private Library borrowable;
    
    public Process(Student student, Library borrowable) {
        
        this.student = student;
        this.borrowable = borrowable;

    }
    public void process() {
     
        borrowable.borrow(student.getTitle()+"\n");

    }
}