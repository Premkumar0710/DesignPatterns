package CreationalDesignPattern.Builder.TraditionalApproach;

public class Builder {
    private int id;
    private String name;
    private int age;
    private String email;
    private String mobile;
    private String univName;

 /* We need to validate before creating object , if we validate after , object will be created in memory & will be garbage collected later after exception is thrown.
    As a result validation should be kept here rather than having it in the student  */
    public Student build(){
        if(this.getAge()>25){
            throw new RuntimeException("Validation fails");
        }
        return new Student(this); // this refers to current object
    }

    public int getId() {
        return id;
    }

    public Builder setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Builder setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Builder setAge(int age) {
        this.age = age;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getUnivName() {
        return univName;
    }

    public void setUnivName(String univName) {
        this.univName = univName;
    }
}
