package exercise;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder(12,2,"red");
        System.out.println(cylinder);

        cylinder = new Cylinder(10,2,"blue");
        System.out.println(cylinder);
    }

}
