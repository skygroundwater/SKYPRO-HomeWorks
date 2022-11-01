package Hogwarts;

class Hufflepuff extends Hogwarts implements Methods{
    private String name;
    private int industriousness;
    private int loyalty;
    private int honest;
    public Hufflepuff(String name, int industriousness, int loyalty, int honest, int magicPower, int transgression){
        this.honest = honest;
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }
    @Override
    public void showInfoAboutStudent() {
        System.out.println(name + ": industriousness " +industriousness +", loyalty " + ", honest " +honest +", magic power " +magicPower +", transgression " + transgression);
    }
    @Override
    public int getSumOfSkillsForStudent() {
        int sum = transgression + magicPower + loyalty + industriousness + honest;
        return sum;
    }
    public String getName(){
        return name;
    }
}