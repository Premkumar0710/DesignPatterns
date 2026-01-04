package CreationalDesignPattern.Builder.ProductionReadyApproach;

public class Client {
    public static void main(String[] args) {

       /* There are chances that client can end up doing student s = new Student(new Builder);
          We shouldn't expose everything to the client.
          As a result we should make student as private */

        Student student = Student.getBuilder()
                .setId(1)   // we need to use builder return type inside
                .setAge(19)
                .setName("Prem Kumar")
                .setEmail("mprem799@gmail.com")
                .build();
        System.out.println(student);

    }
}
