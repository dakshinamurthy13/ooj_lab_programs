package cie;
public class Internals extends Student{
    private float marks[]=new float[5];
    public Internals(float marks[],String name,String usn,int sem){
        super(name,usn,sem);
        this.marks=marks;
    }
    public float[] getCieMarks(){
        return marks;
    }
}