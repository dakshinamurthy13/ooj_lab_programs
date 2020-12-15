import java.util.Random;
class FirstThread implements Runnable{
    private String name;
    private Thread thread;
    public FirstThread(String name){
        System.out.println("Inside the thread "+name);
        this.name=name;
        thread=new Thread(this,name);
        thread.start();
    }
    public void run(){
        try{
            Random random=new Random();
            for(int i=0;i<5;i++){
                int num=random.nextInt(1000);
                System.out.println("The number generated is "+num);
                if(num%2==0)
                    new SecondThread("second",num);
                else
                    new ThirdThread("third",num);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            Thread t=Thread.currentThread();
            System.out.println("Exception in thread "+t);
        }
    }    
}
class SecondThread implements Runnable{
    private String name;
    private int num;
    private Thread thread;
    public SecondThread(String name,int num){
        System.out.println("Inside the thread "+name);
        this.name=name;
        this.num=num;
        thread=new Thread(this,name);
        thread.start();
    }
    public void run(){
        System.out.println("The Square of the number is "+this.num*this.num);
    }
}
class ThirdThread implements Runnable{
    private String name;
    private int num;
    private Thread thread;
    public ThirdThread(String name,int num){
        System.out.println("Inside the thread "+name);
        this.name=name;
        this.num=num;
        thread=new Thread(this,name);
        thread.start();
    }
    public void run(){
        System.out.println("The Cube of the number is "+this.num*this.num*this.num);
    }
}
class ThreadMain{
    public static void main(String args[]){
        new FirstThread("first");
    }
}