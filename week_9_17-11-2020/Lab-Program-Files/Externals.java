package see;
import cie.Student;
public class Externals extends cie.Student{
    private float seeMarks[]=new float[5];
    public Externals(float seeMarks[],String name,String usn,int sem){
        super(name,usn,sem);
        this.seeMarks=seeMarks;
    }
    public float[] getMarks(){
        return seeMarks;
    }
}