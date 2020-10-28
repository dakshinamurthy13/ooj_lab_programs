import java.util.Scanner;
abstract class Player{
    private String name;
    private int matches_played;
    private float average;
    public abstract float cal_average(int matches_played);
    public Player(String name,int matches_played){
        this.name=name;
        this.matches_played=matches_played;
    }
    public void setAverage(float average){
        this.average=average;
    }
    public String getName(){
        return this.name;
    }
    public int getMatchesPlayed(){
        return this.matches_played;
    }
    public float getAverage(){
        return this.average;
    }
}
class Bowler extends Player{
    private int wickets;
    public Bowler(String name,int matches_played,int wickets){
        super(name,matches_played);
        this.wickets=wickets;
    }
    public float cal_average(int matches_played){
        return ((float)this.wickets/matches_played);
    }
    public String toString(){
        return ("Name :"+super.getName()+"\nMatches Played : "+super.getMatchesPlayed()+"\nScore :"+this.wickets+"\nAverage : "+super.getAverage());
    }
}
class Batsman extends Player{
    private int score;
    public Batsman(String name,int matches_played,int score){
        super(name,matches_played);
        this.score=score;
    }
    public float cal_average(int matches_played){
        return ((float)this.score/matches_played);
    }
    public String toString(){
        return ("Name :"+super.getName()+"\nMatches Played : "+super.getMatchesPlayed()+"\nScore :"+this.score+"\nAverage : "+super.getAverage());
    }
}
class CricketMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number of Bowlers");
        int m=s.nextInt();
        Bowler[] bowler=new Bowler[m];
        for(int i=0;i<m;i++){
            System.out.println("Enter the name of Bowler");
            String name=s.next();
            System.out.println("Enter matches played");
            int matchs=s.nextInt();
            System.out.println("Enter the wickets taken");
            int wickets=s.nextInt();
            bowler[i]=new Bowler(name,matchs,wickets);
            float avg=bowler[i].cal_average(matchs);
            bowler[i].setAverage(avg);
        } 
        System.out.println("Enter the number of Batsman");
        int n=s.nextInt();
        Batsman[] batsman=new Batsman[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of Batsman");
            String name=s.next();
            System.out.println("Enter matches played");
            int matchs=s.nextInt();
            System.out.println("Enter score of Batsman");
            int score=s.nextInt();
            batsman[i]=new Batsman(name,matchs,score);
            float avg=batsman[i].cal_average(matchs);
            batsman[i].setAverage(avg);
        }
        System.out.println("Details of bowler");
        for(int i=0;i<m;i++){
            System.out.println("Bowler "+(i+1));
            System.out.println(bowler[i]);
        }
        System.out.println("Details of batsman");
        for(int i=0;i<n;i++){
            System.out.println("Batsman "+(i+1));
            System.out.println(batsman[i]);
        }
    }
}