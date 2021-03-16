import java.util.Scanner;
public class Main {
    static Scanner scan = new Scanner(System.in);
    static int  y=1;
    public static void main(String[] args){
     while(true){
         start();
         System.out.println("ゲームを続けますか 1:yes/2:no");
         y = scan.nextInt();
         if(y==2){
             break;
         }
     }
     scan.close(); 
    }
    public static void start(){
        Card card =new Card();
        Player player = new Player(card);
        Enemy enemy = new Enemy(card);
        enemy.enedrow();
        enemy.drow();
        player.drow();
        player.drow();
        int x=1;
        while(x==1){
        System.out.println("数字を入れてください1:引く or 2:勝負 or 3:降りる");
         x = scan.nextInt();
        if(x==1){
            player.drow();
            if(player.playersum>=22&&player.iti>=1){
                player.playersum -=10;
                player.iti--;
            }
            System.out.println("カードの合計は"+ player.playersum + "です");
            if(player.playersum >=22){
                System.out.println("あなたはbustしました");
                System.out.println("you lose!!");               
                return;
            }
        }
        else if(x==3){
            System.out.println("あなたはdropしました");
            System.out.println("you lose!!");   
                return; 
        }
        else if(x==2){
            enemy.stand();
            if(enemy.enemysum>=22&&enemy.iti>=1){
                enemy.enemysum -=10;
                enemy.iti--;
            }
        }
      }
      if(enemy.enemysum>=22){
        System.out.println("ディーラーの合計は"+enemy.enemysum+"です");
        System.out.println("you win!!");  
         return;     
      }
      if(Math.abs(enemy.enemysum-22)>Math.abs(player.playersum-22)){
        System.out.println("ディーラーの合計は"+enemy.enemysum+"です");
        System.out.println("you win!!");
        return;          
      }
      else if(Math.abs(enemy.enemysum-22)<Math.abs(player.playersum-22)){
        System.out.println("ディーラーの合計は"+enemy.enemysum+"です");
        System.out.println("you lose!!");
        return;
      }
      else if(Math.abs(enemy.enemysum-22)==Math.abs(player.playersum-22)){
        System.out.println("ディーラーの合計は"+enemy.enemysum+"です");
          System.out.println("draw!!");
          return;
      }      
    }
}