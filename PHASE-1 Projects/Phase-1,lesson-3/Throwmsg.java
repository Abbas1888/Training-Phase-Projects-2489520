package multithreadingEH;

public class Throwmsg {
        public static void main(String[] args)
        {

            int a=20,b=2,rs;

            try
            {
                if(b==0)        
                    throw(new ArithmeticException("Can't divide by zero."));
                else
                {
                    rs = a / b;
                    System.out.print("\n\tThe result is : " + rs);
                }
            }
            catch(ArithmeticException Ex)
            {
                System.out.print("\n\tError : " + Ex.getMessage());
            }

            System.out.print("\n\t This program ends here.");
        }
    }


