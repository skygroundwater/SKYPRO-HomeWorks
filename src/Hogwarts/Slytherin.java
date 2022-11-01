package Hogwarts;

class Slytherin extends Hogwarts implements Methods {
    private String name;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name, int cunning, int determination, int ambition, int resourcefulness, int lustForPower, int magicPower, int transgression) {
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }

    @Override
    public void showInfoAboutStudent() {
        System.out.println(name + ": cunning " + cunning + ", determination "+ determination + ", ambition " + ambition +", resourcefulness " +resourcefulness +", lustForPower " + lustForPower +", magic power " +magicPower +", transgression " + transgression);
    }
    public int getSumOfSkillsForStudent(){
        int sum = cunning + determination + ambition + resourcefulness + lustForPower + magicPower + transgression;
        return sum;
    }
    public String getName(){
        return name;
    }
}