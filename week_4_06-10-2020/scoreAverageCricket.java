import java.util.Scanner;
class PlayersInfo{
    private String name;
    private int id;
    private int matchesPlayed;
    private int[] scores;

    PlayersInfo(String name,int id,int matchesPlayed){
        Scanner s=new Scanner(System.in);
        this.name=name;
        this.id=id;
        this.matchesPlayed=matchesPlayed;
        scores=new int[matchesPlayed];
        System.out.println("Enter the scores of player in each match");
        for(int i=0;i<matchesPlayed;i++){
            System.out.print((i+1)+".");
            scores[i]=s.nextInt();
        }
    }
    public void displayAverage(){
        float avg,sum=0;
        for(int i=0;i<matchesPlayed;i++)
            sum+=scores[i];
        avg=sum/matchesPlayed;
        System.out.println("The average of the player is "+avg);
    }
}
class PlayerMain{
    public static void main(String args[]){
        String name;
        int id;
        int matchesPlayed;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name of the player");
        name=s.nextLine();
        System.out.println("Enter the id of the player");
        id=s.nextInt();
        System.out.println("Enter the number of matches the player has played");
        matchesPlayed=s.nextInt();
        PlayersInfo p=new PlayersInfo(name,id,matchesPlayed);
        p.displayAverage();
    }
}