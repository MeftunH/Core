package examples.Lambda;



public class Drawable {
    public static void main(String[] args) {
        int width=10;
        //without lambda
        DrawableInterface d1=new DrawableInterface() {
            @Override
            public void draw() {
                System.out.println("Drawing "+width);
            }
        };
        //with lambda
        DrawableInterface d2=()->{
            System.out.println("Drawing "+width);
        };
        d2.draw();
    }
}
