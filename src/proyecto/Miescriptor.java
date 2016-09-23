package proyecto;

/**
 * Created by Turpitude on 21/09/2016.
 */
public class Miescriptor extends Thread {

    int numth;
    public Miescriptor(int i)
    {
        numth=i;
    }
    public void run(){
        for(int i=0;i<10;i++){
            System.out.print(numth);
        }
    }


}
