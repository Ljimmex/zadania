package pl.javastart.application;



public class app {
    public static void main(String[] args) {

        double czas = 0.00;
        StringBuilder stringBuilder = new StringBuilder("(          )");
        int string = 1;

        try {

            for (double i = czas; i < 200; i++){
                Thread.sleep(200);
                czas += 0.50;
                char progress = i % 2 == 0 ? '/' : '\\';
                System.out.print("Wczytywanie " + progress + " " + czas + stringBuilder + "\r");
                System.out.print("Wczytywanie " + progress + " " + czas + stringBuilder);
                if (czas % 10 == 0){
                    stringBuilder.replace(string, string+1, "#");
                    string++;
                    //stringBuilder.delete(string, string);
                }
            }

            System.out.println("\nZaładowało się, powodzenia");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Żegnaj");




    }
}
