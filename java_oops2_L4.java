public class java_oops2_L4 {
    public static void main(String[] args) {
        Samsung s10 = new Samsung();
        s10.playGames();

        Apple a1 = new Apple();
        a1.playGames();

        s10.playGames(4);
        
    }
}
    class MobilePhone{
        int price;
        int dimensions;
        String os;

        void playGames(){
            System.out.println("Mobiles phones hang a lot");
        }

        // Method Overloading

        void playGames(int x){
            for (int i = 0; i < x; i++){
                System.out.println("Playing games is fun " + i);
            }
        }

    }

    class Samsung extends MobilePhone {

        // Method Overriding
        void playGames(){
            System.out.println("Samsung phones hang a lot");
        }
    }

    class Apple extends MobilePhone{
        
    }

