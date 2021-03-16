public class Enemy implements Human{
    int enemysum =0;
    int iti=0;
    Card B = null;
    public  Enemy (Card A){
    this.B = A;
    }
    public void drow(){
        int drowcard = B.card();
        if(drowcard ==11){
            this.iti++;
            System.out.println("ディーラーはカードを引きました。");
        }
        else{
        System.out.println("ディーラーはカードを引きました。");
        }
        enemysum += drowcard;  
    }
    public void enedrow(){
        int drowcard = B.card();
        if(drowcard ==11){
            this.iti++;
            System.out.println("ディーラーが引いたカードは"+ 1 +"です");
        }
        else{
        System.out.println("ディーラーが引いたカードは"+ drowcard +"です");
        }
        enemysum+= drowcard;
    }
    public void stand(){
        while(enemysum<17){
         int drowcard = B.card();
         if(drowcard ==11){
            this.iti++;
            System.out.println("ディーラーが引いたカードは"+ 1 +"です");
        }
        else{
        System.out.println("ディーラーが引いたカードは"+ drowcard +"です");
        }
        enemysum += drowcard;
        }
    }
}