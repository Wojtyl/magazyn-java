import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //########## SLOT TEST ##########
        System.out.println("########## SLOT TEST ##########");
        //Produkty testowe
        Produkt testsl_p1 = new Produkt("Glosniki",10,20,20,5);
        Produkt testsl_p2 = new Produkt("Myszka", 10,10,10,5);
        Produkt testsl_p3 = new Produkt("Klawiatura",5,10,10,5);
        Produkt testsl_p4 = new Produkt("Monitor",5,10,10,5);

        //Sloty testowe
        Slot testsl_s2 = new Slot(10, 20, 20);
        System.out.println(testsl_s2.toString());

        System.out.println("\n\t//Dodawanie PRODUKTÓW");

        //Dodawanie produktów
        testsl_s2.addProdukt(testsl_p2, testsl_p3, testsl_p4);
            //Dodanie drugi raz tego samego produktu
        testsl_s2.addProdukt(testsl_p2);
            //Dodanie produktu o zbyt dużych rozmiarach/na którego już nie ma miejsca w slocie
        testsl_s2.addProdukt(testsl_p1);
        System.out.println(testsl_s2.toString());

        System.out.println("\n\t//USUWANIE PRODUKTÓW");
        //Usuwanie produktów
        testsl_s2.delProduct(1);
        testsl_s2.delProduct(testsl_p3);
        //Usuwanie produktów których nie ma
        testsl_s2.delProduct(33);
        System.out.println(testsl_s2.toString());
        System.out.println("##########################################################\n\n");


        //########## PRZESLO TEST ##########
        System.out.println("########## PRZESLO TEST ##########");
        Produkt testprz_p1 = new Produkt("Mleko", 5,5,5,10);
        Produkt testprz_p2 = new Produkt("Cukier", 5,5,5,10);
        Slot testprz_sl1 = new Slot(10,20,20);
        Slot testprz_sl2 = new Slot(10,20,20);
        Slot testprz_sl3 = new Slot(10,20,20);


        Przeslo testprz_prz1 = new Przeslo(testprz_sl1, testprz_sl2);
        Przeslo testprz_prz2 = new Przeslo(10,10,10, 2, "pion");
        Przeslo testprz_prz3 = new Przeslo(30,15,10, 3, "poziom");
        System.out.println(testprz_prz1.toString());

        //Ddowawanie slotów do przęsła
        System.out.println("\n\t//DODAWANIE SLOTÓW");
        testprz_prz1.addSlot(testprz_sl3);
        testprz_prz1.addSlot(testprz_sl3);

        //Dodawanie produktów do przęsła
        System.out.println("\n\t//DODAWANIE PRODUKTÓW");
        testprz_prz1.addProduct(testprz_p1);
        testprz_prz1.addProduct(testprz_p2);

        System.out.println("\n"+testprz_prz1.toString());

        //Pokazywanie produktów w przęśle
        System.out.println("\n\t//POKAZYWANIE PRODUKTÓW");
        testprz_prz1.showProducts();
        testprz_prz1.getProduct(4);
        //Pokazywanie produktu nie zanjdującego się w półce
        testprz_prz1.getProduct(2);
        testprz_prz1.showProducts();

        //Test poprawności przęsła
        System.out.println("\n\t//TEST PRZESEL");
            //Przeslo niepoprawne bo zostało stworzone na podstawie dwóch przęseł a zostało dodane jeszcze jedno - więc nie zmieściło się w przęśle
        testprz_prz1.isOk();
        testprz_prz2.isOk();
        System.out.println("##########################################################\n\n");


        //########## REGAL TEST ##########
        System.out.println("########## REGAL TEST ##########");
        Produkt testreg_p1 = new Produkt("Bluza", 10,60,30,10);
        Produkt testreg_p2 = new Produkt("Spodnie", 5,5,5,10);
        Produkt testreg_p3 = new Produkt("Buty", 5,5,5,10);

        Przeslo testreg_prz1 = new Przeslo(30,60,30,3,"poziom");
        Przeslo testreg_prz2 = new Przeslo(30,60,30,3,"poziom");
        Przeslo testreg_prz3 = new Przeslo(30,60,30,3,"poziom");


        Regal testreg_reg1 = new Regal(testreg_prz1, testreg_prz2, testreg_prz3);
        Regal testreg_reg2 = new Regal(30,20,20,3);

        System.out.println(testreg_reg1.toString());
        System.out.println(testreg_reg2.toString());

        System.out.println("\n\t//DODAWANIE DO REGAŁU");
        testreg_reg1.addProduct(testreg_p1);
        testreg_reg1.addProduct(testreg_p2);
        testreg_reg1.addProduct(testreg_p3);


        System.out.println(testreg_reg1.toString());

        //Pobieranie produktu
        System.out.println("\n\t//POBIERANIE Z REGAŁU");
        testreg_reg1.getProduct(6);
        testreg_reg1.getProduct(36);

        System.out.println(testreg_reg1.toString());


    }
}