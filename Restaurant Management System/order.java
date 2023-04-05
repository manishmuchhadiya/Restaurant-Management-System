import java.util.*;

class order {
    void Panjabi() {
        System.out.println("\n ------------------------------------------------------");
        System.out.print("\n 1.Paneer Tikka ");
        System.out.print("\n 2.Rajma Chawal ");
        System.out.print("\n 3.Chhole Bhature ");
        System.out.print("\n 4.Aloo paratha  \n");
        Scanner sc1 = new Scanner(System.in);
        System.out.print("\nEnter Choice: ");
        int Choice1 = sc1.nextInt();

        switch (Choice1) {
            case 1:
                System.out.println("How many dice you want to order");
                int PaneerTikka = sc1.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (PaneerTikka * 190));
                // Paneer Tikka one dice price 190
                break;
            case 2:
                System.out.println("How many dice you want to order");
                int RajmaChawal = sc1.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (RajmaChawal * 150));
                // Rajma Chawal one dice price 150
                break;
            case 3:
                System.out.println("How many dice you want to order");
                int ChholeBhature = sc1.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (ChholeBhature * 80));
                // Chhole Bhature one dice price 80
                break;
            case 4:
                System.out.println("How many dice you want to order");
                int AlooParatha = sc1.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (AlooParatha * 135));
                // Aloo paratha one dice price 135
                break;
            default:
                System.out.println("\nInvalid Choice");
        }
    }

    void SouthIndian() {
        System.out.println("\n ------------------------------------------------------");
        System.out.print("\n 1.Dosas ");
        System.out.print("\n 2.Idlis ");
        System.out.print("\n 3.Uttapams ");
        System.out.print("\n 4.Medu vada  \n");
        Scanner sc2 = new Scanner(System.in);
        System.out.print("\nEnter Choice: ");
        int Choice2 = sc2.nextInt();

        switch (Choice2) {
            case 1:
                System.out.println("How many dice you want to order");
                int Dosas = sc2.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (Dosas * 150));
                // Dosas one dice price 150
                break;
            case 2:
                System.out.println("How many dice you want to order");
                int Idlis = sc2.nextInt();
                System.out
                        .println(
                                "==============================================================> Your order's price is "
                                        + (Idlis * 75));
                // Idlis one dice price 75
                break;
            case 3:
                System.out.println("How many dice you want to order");
                int Uttapams = sc2.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (Uttapams * 120));
                // Uttapams one dice price 120
                break;
            case 4:
                System.out.println("How many dice you want to order");
                int MeduVada = sc2.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (MeduVada * 90));
                // MeduVada one dice price 90
                break;
            default:
                System.out.println("\nInvalid Choice");
        }
    }

    void Chinese() {
        System.out.println("\n ------------------------------------------------------");
        System.out.print("\n 1.Dumplings ");
        System.out.print("\n 2.Chow Mein ");
        System.out.print("\n 3.Chinese Hot Pot ");
        System.out.print("\n 4.Manchurian  \n");
        Scanner sc3 = new Scanner(System.in);
        System.out.print("\n Enter Choice: ");
        int Choice3 = sc3.nextInt();

        switch (Choice3) {
            case 1:
                System.out.println("How many dice you want to order");
                int Dumplings = sc3.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (Dumplings * 60));
                // dumplings one dice price 60
                break;
            case 2:
                System.out.println("How many dice you want to order");
                int ChowMein = sc3.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (ChowMein * 50));
                // ChowMein one dice price 50
                break;
            case 3:
                System.out.println("How many dice you want to order");
                int ChineseHotPot = sc3.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (ChineseHotPot * 260));
                // chinese hot pot one dice price 260
                break;
            case 4:
                System.out.println("How many dice you want to order");
                int Manchurian = sc3.nextInt();
                System.out.println(
                        "==============================================================> Your order's price is "
                                + (Manchurian * 120));
                // chinese hot pot one dice price 120
                break;
            default:
                System.out.println("\nInvalid Choice");
        }
    }

    void Bill() {

        System.out.println("Your Bill is : ");
    }

    public static void main(String args[]) {
        boolean done = false;
        do {

            System.out.println("\n*******************************************************");
            System.out.println(" ********** Welcome To Santa Klaus Restaurant **********");
            System.out.println(" *******************************************************");

            System.out.println("\n  1.Panjabi");
            System.out.println("\n  2.South Indian");
            System.out.println("\n  3.Chinese");
            System.out.println("\n  4.EXIT");
            // System.out.println("\n 4.Bill");

            System.out.print("\n ============================================ Enter Choice: ");

            Scanner sc = new Scanner(System.in);
            int Choice = sc.nextInt();
            order orderObj = new order();

            switch (Choice) {
                case 1:
                    orderObj.Panjabi();
                    break;
                case 2:
                    orderObj.SouthIndian();
                    break;
                case 3:
                    orderObj.Chinese();
                    break;
                // case 4:
                // orderObj.Bill();
                // break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid Choice");
            }
        } while (!done);
    }
}