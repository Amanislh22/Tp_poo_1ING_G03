public class Main {
    public static void main(String[] args) {

        Point p = new Point(5,4);
        System.out.println("point A : ");
        p.affiche();
        p.deplace(1,1);
        System.out.println("after calling deplace function");
        p.affiche();
    }
}