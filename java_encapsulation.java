public class java_encapsulation {
    public static void main(String[] args) {

        // Secret obj = new Secret();

        // // obj.data = 4;

        // obj.setData(108);
        // obj.setData(25);
        // obj.setData(4);

        // System.out.println(obj.getData());

        BankAccount obj2 = new BankAccount();
        obj2.setAmount(1578, 250);
        obj2.setAmount(9876, 250);
        System.out.println(obj2.getAmount());
    }
}
    // class Secret {
    //     private int data;

    //     public void setData(int data){
    //         if(data > 100){
    //             this.data = data;
    //         }
    //         else{
    //             System.out.println("You are not allowed to change data");
    //         }
    //     }

    //     public int getData(){
    //         return data;
    //     }

    // }

    class BankAccount{
        int otp = 9876;
        private int amount;

        public void setAmount(int otp, int amount){
            if(otp == this.otp){
                this.amount = amount;
            }
        }

        public int getAmount(){
            return amount;
        }

    }
    

