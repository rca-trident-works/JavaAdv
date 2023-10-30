package pacagea;

public class ClassA {
    public int publicField;
    private String privateField;

    //Getter
    public String getPrivateField() {
        return privateField;
    }

    //Setter
    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }

    public void publicMethod() {
        System.out.println("Publicメソッド");
    }

    public void privateMethod() {
        System.out.println("Privateメソッド");
    }
}
