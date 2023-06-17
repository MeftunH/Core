package main.java.threading.pools;

public class ThreadPoolProcessor implements Runnable{
    private int id;
    public ThreadPoolProcessor(int id){
        this.id=id;
    }
    @Override
    public void run(){
        System.out.println("Starting :"+id);
        try{
            Thread.sleep(5000);
        }catch(InterruptedException e){
        }
        System.out.println("Done :"+id);
    }
}
