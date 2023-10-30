public class Driver {
    public static void main(String[] args) {
        ColoredCircle c0 = new ColoredCircle ();
        double d = c0.getRadius();
        String s = c0.getColor();


        ColoredCircle c1 = new ColoredCircle (12.3,"red");
        ColoredCircle c2 = new ColoredCircle();
        ColoredCircle c3 = new ColoredCircle (41.3);
        ColoredCircle c4 = new ColoredCircle ("orange");


        System.out.println(c1.getRadius());
        System.out.println(c1.getColor());

        System.out.println(c2.getRadius());
        System.out.println(c2.getColor());

        System.out.println(c3.getRadius());
        System.out.println(c3.getColor());

        System.out.println(c4.getRadius());
        System.out.println(c4.getColor());

        c1.setRadius(1.2);
        System.out.println(c1.getRadius());

        c1.setRadius(-1.2);
        System.out.println(c1.getRadius());

        c2.setColor("green");
        System.out.println(c2.getColor());

        double area = c3.getArea();
        System.out.println(area);

    }
}
