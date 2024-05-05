//zad2

public class Main2 {
    public static void main(String[] args) {
        Address address = new Address();

        String address1 = address.createAddress("Polska");
        System.out.println(address1); // Output: Kraj: Polska

        String address2 = address.createAddress("Polska", "Warszawa");
        System.out.println(address2); // Output: Kraj: Polska, Miasto: Warszawa

        String address3 = address.createAddress("Polska", "Warszawa", "00-001");
        System.out.println(address3); // Output: Kraj: Polska, Miasto: Warszawa, Kod pocztowy: 00-001

        String address4 = address.createAddress("Polska", "Warszawa", "00-001", "Aleje Jerozolimskie");
        System.out.println(address4); // Output: Kraj: Polska, Miasto: Warszawa, Kod pocztowy: 00-001, Ulica: Aleje Jerozolimskie

        String address5 = address.createAddress("Polska", "Warszawa", "00-001", "Aleje Jerozolimskie", 123);
        System.out.println(address5); // Output: Kraj: Polska, Miasto: Warszawa, Kod pocztowy: 00-001, Ulica: Aleje Jerozolimskie, Numer domu: 123

    }
}
