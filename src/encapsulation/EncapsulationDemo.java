package encapsulation;

public class EncapsulationDemo {

    private int id;//global variable, instance variable
    private String name;
    private String address;

    public void setId(int id1){
        if(id1==0){
            System.out.println("you id is zero");
        }else {
            id = id1;
        }
    }
    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public static void main(String[] args) {

        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setId(0);
        System.out.println(obj.getId());
    }
}
