package model;

//import jdk.incubator.vector.VectorOperators;

public class TestClass {
    private Integer id;
    private String name;

    public void setId(Integer id) {
        this.id = id;

    }
    public Integer getId() {
        return this.id;
    }

    public void setName(String name) {
        this.name = name;

}
public String getName() {
        return this.name;
}

public TestClass(){
}

public TestClass(Integer id){
        this.id = id;
}

public  TestClass(String name){
        this.name = name;
}
public TestClass(Integer id, String name){
        this.id = id;
        this.name = name;

}
}
