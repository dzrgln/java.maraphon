package FinalProject;

import FinalProject.Game.Battlefield;
import FinalProject.Game.Player;
import FinalProject.Ships.Fleet;

public class StartGame {
    public static void main(String[] args) {

        Battlefield battlefield1 = new Battlefield();
        Battlefield battlefield2 = new Battlefield();
        Player player1 = new Player(battlefield1);
        Player player2 = new Player(battlefield1);

        Fleet fleet1 = new Fleet();
        fleet1.addFleet(player1, battlefield1);
        Fleet fleet2 = new Fleet();
        fleet2.addFleet(player2, battlefield2);

        System.out.println("Да начнется бой!");
        while (true){
            player1.shot(battlefield2, fleet2);
            battlefield2.printBattlefield();
            if(fleet2.end() == true){
                System.out.println("Конец игры");
                break;
            }

            player2.shot(battlefield1, fleet1);
            battlefield1.printBattlefield();
            if(fleet1.end() == true){
                System.out.println("Конец игры");
                break;
            }
        }
    }
}
