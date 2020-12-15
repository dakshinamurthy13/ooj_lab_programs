class ChildThread implements Runnable{
    private String name;
    private Thread thread;
    public ChildThread(String name){
        this.name=name;
        System.out.println("In thread "+this.name);
        thread=new Thread(this,name);
        thread.start();
    }
    public void run(){
        int sum=0;
        System.out.println("Inside Thread "+this.name);
        for(int i=0;i<100;i++){
            if(i%2==1)
                sum+=i;
        }
        Thread t=Thread.currentThread();
        System.out.println("The Sum of all odd number from 1 - 100 is "+sum+" it is calculated in the thread "+t);
    }
}
class ThreadMain{
    public static void main(String args[]){
        new ChildThread("childThread");
        Thread t=Thread.currentThread();
        System.out.println("Inside Thread "+t);
        int sum=0;
        for(int i=0;i<100;i++){
            if(i%2==0)
                sum+=i;
        }
        System.out.println("The Sum of all even number from 1 - 100 is "+sum+" it is calculated in the thread "+t);
    }
}