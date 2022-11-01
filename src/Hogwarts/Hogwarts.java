package Hogwarts;

public class Hogwarts {
    protected int magicPower;
    protected int transgression;
    public static void showInfoAboutStudent (Methods student){
        student.showInfoAboutStudent();
    }
    public static void compareStudents(Methods student1, Methods student2){
        if(student1.getSumOfSkillsForStudent()>student2.getSumOfSkillsForStudent()){
            System.out.println(student1.getName() + " more strong than " + student2.getName());
        } else {
            System.out.println(student2.getName() + " more strong than " + student1.getName());
        }
    }
    public static void compareStudentsFromOneFaculty(Methods student1, Methods student2){
        if(student1.getClass().equals(student2.getClass())){
            if(student1.getSumOfSkillsForStudent()>student2.getSumOfSkillsForStudent()){
                System.out.println(student1.getName() + " more strong than " +student2.getName());
            } else {
                System.out.println(student2.getName() + " more strong than " +student1.getName());
            }
        } else {
            System.out.println("Students are studying at other faculties");
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Methods garryPotter = new Gryffindor("Garry Potter", 10, 10, 30, 17,33);
        Methods hermioneGranger = new Gryffindor("Hermione Granger", 9, 9, 25,19, 13);
        Methods ronWeasley = new Gryffindor("Ron Weasley", 7, 7, 20, 15,16);
        Methods zhouChang = new Ravenclaw("Zhou Chang", 10, 8, 7, 6,21,14);
        Methods padmaPatil = new Ravenclaw("Padma Patil", 9, 7, 6, 5, 29,12);
        Methods marcusBelby = new Ravenclaw("Marcus Belby", 8, 6, 5, 4, 19, 25);
        Methods zachariahSmith = new Hufflepuff("Zachariah Smith", 15, 10,10, 9, 13);
        Methods cedricDiggory = new Hufflepuff("Cedric Diggory", 14, 9, 9, 14, 17);
        Methods justinFinchFletchley = new Hufflepuff("Justin Finch-Fletchley", 13, 8,8, 20, 23);
        Methods drakoMalfoy = new Slytherin("Drako Malfoy", 7, 7,7,7,7, 14,26);
        Methods grahamMontegu = new Slytherin("Graham Montegu", 7,6,5,4,5,14,16);
        Methods gregoryGoyl = new Slytherin("Gregory Goyl", 6,6,5,5,4, 23,16);

        compareStudentsFromOneFaculty(hermioneGranger, gregoryGoyl);
        compareStudents(drakoMalfoy, garryPotter);
        showInfoAboutStudent(ronWeasley);
    }
}
