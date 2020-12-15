class CustomThread implements Runnable{
    private String message;
    private String name;
    private int threadNumber;
    private Thread thread;
    public CustomThread(String message,String name,int threadNumber){
        this.message=message;
        this.threadNumber=threadNumber;
        this.name=name;
        System.out.println("Inside thread "+this.name);
        thread=new Thread(this,this.name);
        thread.start();
    }
    public void run(){
        try{
            for(int i=0;i<3;i++){
                System.out.println(message);
                if(this.threadNumber==1){
                    Thread.sleep(10000);
                }else{
                    Thread.sleep(2000);
                }
            }
        }catch(InterruptedException e){
            System.out.println("The thread "+this.threadNumber+" was interrupted");
        }
    }
}
class ThreadMain{
    public static void main(String args[]){
        new CustomThread("BMS College of engineering","college",1);
        new CustomThread("CSE","department",2);
    }
}