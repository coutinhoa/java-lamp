import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type on or off to turn on/off the lamp and status to see its status.");
        Lamp lamp = new Lamp();

        while(true) {
            String input= scanner.nextLine();

            if(input.equals("")) {
                System.out.println("The lamp will now go to sleep.");
                return;
            }
            else if(input.equals("status")) {
                if(lamp.getStatus()==(true)){
                System.out.println("lamp status is on");}
                else{ System.out.println("lamp status is off");}
            }
            else if (input.equals("on")) {

              lamp.setStatus(true);
                if(lamp.getStatus()==(true)){
                    System.out.println("lamp is on");}
            }
             else if (input.equals("off")) {

                lamp.setStatus(false);
                if(lamp.getStatus()==(false)){
                System.out.println("lamp is off");}

            } else {
                System.out.println("The available commands are on, off and status.");
            }
        }
    }
}