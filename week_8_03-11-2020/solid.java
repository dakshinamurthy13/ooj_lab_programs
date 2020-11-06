import java.util.Scanner;
abstract class Solid{
    private float a;
    private float b;
    public float getA(){
        return this.a;
    }
    public float getB(){
        return this.b;
    }
    public Solid(float a,float b){
        this.a=a;
        this.b=b;
    }
    public Solid(float a){
        this.a=a;
    }
    public abstract void printSurfaceArea();
    public abstract void printVolume();
}
class Cylinder extends Solid{
    public Cylinder(float a,float b){
        super(a,b);
    }
    public void printSurfaceArea(){
        float r=super.getA();
        float h=super.getB();
        System.out.println("The Surface area of Cylinder is "+(2*Math.PI*r*h));
    }
    public void printVolume(){
        float r=super.getA();
        float h=super.getB();
        System.out.println("The Volume of Cylinder is "+(Math.PI*r*r*h));
    }
}
class Cone extends Solid{
    public Cone(float a,float b){
        super(a,b);
    }
    public void printSurfaceArea(){
        float r=super.getA();
        float h=super.getB();
        System.out.println("The Surface area of Cone is "+((Math.PI*r*Math.sqrt((Math.pow(r,2)+Math.pow(h,2))))));
    }
    public void printVolume(){
        float r=super.getA();
        float h=super.getB();
        System.out.println("The Volume of Cone is "+((Math.PI*r*r*h)/3));
    }
}
class Sphere extends Solid{
    public Sphere(float a){
        super(a);
    }
    public void printSurfaceArea(){
        float r=super.getA();
        System.out.println("The Surface area Sphere of is "+(4*Math.PI*r*r));
    }
    public void printVolume(){
        float r=super.getA();
        System.out.println("The Surface area Sphere of is "+((4*Math.PI*r*r*r)/3));
    }
}
class SolidMain{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("ENter the  base and height of the cylinder");
        float a=s.nextFloat();
        float b=s.nextFloat();
        Cylinder r=new Cylinder(a,b);
        System.out.println("Enter the base and height of the cone");
        a=s.nextFloat();
        b=s.nextFloat();
        Cone t=new Cone(a,b);
        System.out.println("Enter the radius of sphere");
        a=s.nextFloat();
        Sphere c=new Sphere(a);
        r.printSurfaceArea();
        r.printVolume();
        t.printSurfaceArea();
        t.printVolume();
        c.printSurfaceArea();
        c.printVolume();
    }
}