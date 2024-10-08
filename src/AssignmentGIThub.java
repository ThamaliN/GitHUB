public class AssignmentGIThub {

    public static void main(String[] args) {
        int age = 100;
         if(age > 0 &&  age < 18)
         {
            System.out.println("You are underage.");
            if ( age >= 15)
            {
                System.out.println("Youcandrive a moped.");
            }

            if (age == 10)
            {
                System.out.println("Annivasary Part!!");
            }
         }
         else if (age == 18)
         {
            System.out.println("You can drive a car.");
         }

         else if ( age == 20 || age == 30 || age == 40 || age == 50 || age == 60 )
         {
            System.out.println("Annivasary Part!!");
            
         }
         else if(age > 40 && age < 50)
         {
            System.out.println("Happy mid life.");
         }   
         
         else if ( age >= 65)
         {
            System.out.println("You are retired.");

            if (age == 100)
            {
                System.out.println("Annivasary Part!!");
                System.out.println("Congratulations!");
                System.out.println("Congratulations!");
                System.out.println("Congratulations!");
            }

            if (age == 70 || age == 80|| age == 90 ||  age == 110 || age == 120)
            {
                System.out.println("Annivasary Part!!");
            }
            
         }

         else{
            System.out.println("You are an adult.");
         }
         System.out.println("Press space to exit");
    }

}
