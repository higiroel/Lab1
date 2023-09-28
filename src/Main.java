public class Main {
    public static void main(String[] args) {
        // Create a Person object
        Person person = new Person("Eman", "Higz", "20022", "Mr.", 2001);

        // Create a Product object
        Product product = new Product("Sofa", "Best Quality", "P001", 700.99);

        // Display Person and Product information
        System.out.println("Person Information:");
        System.out.println("Full Name: " + person.fullName());
        System.out.println("Formal Name: " + person.formalName());
        System.out.println("Age: " + person.getAge());
        System.out.println("CSV Data Record: " + person.toCSVDataRecord());

        System.out.println("\nProduct Information:");
        System.out.println("Name: " + product.getName());
        System.out.println("Description: " + product.getDescription());
        System.out.println("ID: " + product.getID());
        System.out.println("Cost: $" + product.getCost());
        System.out.println("CSV Data Record: " + product.toCSVDataRecord());
    }
}
