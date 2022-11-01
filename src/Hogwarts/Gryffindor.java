package Hogwarts;

class Gryffindor extends Hogwarts implements Methods{
    private String name;
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int nobility, int honor, int bravery, int magicPower, int transgression) {
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
        this.name = name;
        this.magicPower = magicPower;
        this.transgression = transgression;
    }
    @Override
    public void showInfoAboutStudent() {
        System.out.println(name +": nobility "+nobility+", honor " + honor +", bravery " + bravery +", magic power " +magicPower +", transgression " + transgression);
    }
    @Override
    public int getSumOfSkillsForStudent() {
        int sum= transgression + magicPower + bravery + honor + nobility;
        return sum;
    }
    public String getName(){
        return name;
    }
}