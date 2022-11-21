package Human;
public class Human {
    private final int yearOfBirth;
    private final String name;
    private final String town;
    private final String jobTitle;
    private static final String noInfo = " <информация не указана>";
    public Human(String name, int yearOfBirth, String town, String jobTitle){
        if(name == null || name.isEmpty()) this.name = noInfo; else this.name  = name;
        if(yearOfBirth>=0) this.yearOfBirth = yearOfBirth; else this.yearOfBirth = Math.abs(yearOfBirth);
        if(town == null || town.isEmpty()) this.town = noInfo; else this.town = town;
        if(jobTitle == null) this.jobTitle = noInfo; else this.jobTitle = jobTitle;
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
