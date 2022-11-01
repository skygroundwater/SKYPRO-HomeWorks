package Hogwarts;

class Ravenclaw extends Hogwarts implements Methods{
    private String name;
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    public Ravenclaw(String name, int mind, int wisdom, int wit, int creation, int magicPower, int transgression){
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }
    @Override
    public void showInfoAboutStudent() {
        System.out.println(name +": mind "+ mind +", wisdom " + ", wit "+wit+", creation " +creation +", magic power " +magicPower +", transgression " + transgression);
    }
    @Override
    public int getSumOfSkillsForStudent() {
        int sum = transgression + magicPower + mind + wit + wisdom + creation;
        return sum;
    }
    public String getName(){
        return name;
    }
}