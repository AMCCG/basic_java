package pattren.creational.builder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Builder Pattern");
        User user1 = User
                .builder("John", "john@abc@gmail.com")
                .build();
        System.out.println(user1); // User = { name: 'John', email: 'john@abc@gmail.com', phone: 'unknown', city: 'unknown' }

        User user2 = User
                .builder("Mary", "mary@abc@gmail.com")
                .city("Colombo")
                .build();
        System.out.println(user2); // User = { name: 'Mary', email: 'mary@abc@gmail.com', phone: 'unknown', city: 'Colombo' }
    }

}
