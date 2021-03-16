public class Player implements Human {
    int iti=0;
    int playersum=0;
    Card B = null; /*自分のカラのカード,別のクラスからやるときは引き抜く*/
    public Player (Card A){
    this.B = A;
    }
    public void drow(){
        int drowcard = B.card();
        if(drowcard ==11){
            this.iti++;
         System.out.println("あなたが引いたカードは" + 1 + "です");    
        }
        else{
        System.out.println("あなたが引いたカードは" + drowcard + "です");
        }
        playersum+=drowcard;
    }
    public void drop(){
        System.out.println("あなたは降りました");
    }
}