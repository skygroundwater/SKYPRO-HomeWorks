package pro.skypro.course2.collections.collections.AdditionalTasksForCollections;

public class Item {
    private String name;

    public Item(String value){
        this.name = value;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    @Override
    public String toString(){
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
