import Assignment4.*;
class Assignment_4
{
   public static void main(String[] args)
   {
     //Account obj1 = new Account();
     AccountOverDrawDemo obj2 = new AccountOverDrawDemo();
     Thread one = new Thread(obj2);
        Thread two = new Thread(obj2);
        one.setName("Pratham");
        two.setName("Prachi");
        two.setPriority(10);
        one.start();
        two.start();
     //AccountOverDrawSafeDemo obj3 = new AccountOverDrawSafeDemo();
    }
}


/*
public class Master {
    public static void main(String[] args) {
        AccountOverDrawDemo acc = new AccountOverDSrawDemo();
        Thread one = new Thread(acc);
        Thread two = new Thread(acc);
        one.setName("Pratham");
        two.setName("Prachi");
        two.setPriority(10);
        one.start();
        two.start();
    }
}
*/