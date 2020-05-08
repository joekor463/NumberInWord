public class NumberInWorld {
    public static void main(String [] args)
        {
            printNumberOfWorld(1);
            printNumberOfWorld(2);
            printNumberOfWorld(3);
            printNumberOfWorld(4);
            printNumberOfWorld(5);
            printNumberOfWorld(6);
            printNumberOfWorld(7);
            printNumberOfWorld(8);
            printNumberOfWorld(9);
            printNumberOfWorld(0);
            printNumberOfWorld(-2);

        }
        public static void printNumberOfWorld(int number){
            switch (number) {
                case (0):
                    System.out.println ( "ZERO" );
                    break;
                case (1):
                    System.out.println ( "ONE" );
                    break;
                case (2):
                    System.out.println ( "TWO" );
                    break;
                case (3):
                    System.out.println ( "Thri" );
                    break;
                case (4):
                    System.out.println ( "Four" );
                    break;
                case (5):
                    System.out.println ( "FIVE" );
                    break;
                case (6):
                    System.out.println ( "SIX" );
                    break;
                case (7):
                    System.out.println ( "Seven" );
                    break;
                case (8):
                    System.out.println ( "Eith" );
                    break;
                case (9):
                    System.out.println ( "NINE" );
                    break;
                default:
                    System.out.println ( "Vse ne to" );
                    break;
            }
        }
    }


