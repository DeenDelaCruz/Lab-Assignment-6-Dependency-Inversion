public class TestProgram {

    public static void main(String[] args) {
        
        Student student1 = new Student("001", "Dela Cruz", "Deen", "Berserk");
        Process process1 = new Process(student1, new BorrowBook());
        System.out.println("Student Name: " + student1.getLastName()+", "+student1.getFirstName()+"\nStudent Number: " + student1.getStudentNo());
        process1.process();
    
        Student student2 = new Student("002", "Juan", "Cyriljosh", "Vinland Saga");
        Process process2 = new Process(student2, new BorrowBook());
        System.out.println("Student Name: " + student2.getLastName()+", "+student2.getFirstName()+"\nStudent Number: " + student2.getStudentNo());
        process2.process();
    
        Student student3 = new Student("003", "Galam", "Mark", "Leaves of Grass");
        Process process3 = new Process(student3, new BorrowJournal());
        System.out.println("Student Name: " + student3.getLastName()+", "+student3.getFirstName()+"\nStudent Number: " + student3.getStudentNo());
        process3.process();
    
        Student student4 = new Student("004", "Dizon", "Cedrick", "Diary of a Wimpy Kid");
        Process process4 = new Process(student4, new BorrowJournal());
        System.out.println("Student Name: " + student4.getLastName()+", "+student4.getFirstName()+"\nStudent Number: " + student4.getStudentNo());
        process4.process();
    }
}