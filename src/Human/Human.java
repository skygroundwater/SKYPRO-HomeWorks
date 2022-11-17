package Human;
public class Human {
    private int yearOfBirth;
    private  String name;
    private String town;
    private String jobTitle;
    private static final String noInfo = " <информация не указана>";
    public Human(String name, int yearOfBirth, String town, String jobTitle){
        if(name == null || name.isEmpty()) this.name = noInfo; else this.name  = name;
        if(yearOfBirth>=0) this.yearOfBirth = yearOfBirth; else this.yearOfBirth = Math.abs(yearOfBirth);
        if(town == null || town.isEmpty()) this.town = noInfo; else this.town = town;
        if(jobTitle == null || jobTitle.isEmpty()) this.jobTitle = "<сейчас нигде не работает>"; else this.jobTitle = jobTitle;
    }
    public int getYearOfBirth() {
        return yearOfBirth;
    }
    public String getJobTitle() {
        return jobTitle;
    }
    public String getName() {
        return name;
    }
    public String getTown() {
        return town;
    }
    public void setJobTitle(String jobTitle) {
        if(jobTitle == null) this.jobTitle = "<сейчас нигде не работает>"; else this.jobTitle = jobTitle;
    }
    public void setName(String name) {
        if(name == null || name.isEmpty()) this.name = noInfo; else this.name  = name;
    }
    public void setTown(String town) {
        if(town == null || town.isEmpty()) this.town = noInfo; else this.town = town;
    }
    public void setYearOfBirth(int yearOfBirth) {
        if(yearOfBirth>=0) this.yearOfBirth = yearOfBirth; else this.yearOfBirth = Math.abs(yearOfBirth);
    }
    @Override
    public String toString(){
        return "Привет! Меня зовут "+name+". Я из города "+town+". Я родился в "+yearOfBirth+" году. Я работаю на должности <"+ jobTitle +"> . Будем знакомы!";
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass().equals(this.getClass())) {
            if (obj == this) return true;
            Human human = (Human) obj;
            return name.equals(((Human) obj).name) && yearOfBirth == ((Human) obj).yearOfBirth && town.equals(((Human) obj).town) && jobTitle.equals(((Human) obj).jobTitle);
        }
        return true;
    }
    @Override
    public int hashCode(){
        return java.util.Objects.hash(name, yearOfBirth, town, jobTitle);
    }
}
