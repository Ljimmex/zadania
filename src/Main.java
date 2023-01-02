public class Main{
    public static void main(String[] args) {

        //Seller 1
        //adres
        adress adres1 = new adress();
        adres1.city = "Wrocław";
        adres1.postalCode = "50-500";
        adres1.street = "Kościuszki";
        adres1.homeNumber = "24a";
        adres1.flatNumber = 21;
        // first and last name
        Seller seller1 = new Seller();
        seller1.firstName = "Jan";
        seller1.lastName = "Kowalski";
        seller1.sellerAdres = adres1;
        //auction
        auction auction1 = new auction();
        auction1.title = "Xbox One";
        auction1.descriptiomn = "Konsola dla wymagających graczy";
        auction1.price = 999.99;
        auction1.seller = seller1;

        //Seller 2
        // first and last name
        Seller seller2 = new Seller();
        seller2.firstName = "Justyna";
        seller2.lastName = "Adamczyk";
        seller2.sellerAdres = adres1;
        //auction
        auction auction2 = new auction();
        auction2.title = "Samsung galaxy s20 5g";
        auction2.descriptiomn = "KNiesamowity yelefon z trzema obiektywami";
        auction2.price = 3999;
        auction2.seller = seller2;

        System.out.println("Aukcja 1: ");
        System.out.println("Przedmiot: " + auction1.title);
        System.out.println("Opis: " + auction1.descriptiomn);
        System.out.println("Cena: " + auction1.price);

    }
}