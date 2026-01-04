package CreationalDesignPattern.Builder.TraditionalApproach;

public class Client {
    public static void main(String[] args) {

        // Approach 1
        Builder builder = Student.getBuilder();
        builder.setId(1);
        builder.setName("Prem");
        builder.setAge(23);

        Student student = builder.build();
        System.out.println(student);


        // Approach 2 (Recommended)
        Student student1 = Student.getBuilder()
                .setId(1)   // we need to use builder return type inside
                .setAge(19)
                .setName("Prem Kumar")
                .build();
        System.out.println(student1);

    }
}
