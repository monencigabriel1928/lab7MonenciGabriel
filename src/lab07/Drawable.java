package lab07;

interface Drawable {
    void draw();
}

class Circles implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Circles");
    }
}

class Square implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

class Triangles implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangles");
    }
}
class DrawingDemo {
    public static void main(String[] args) {
        // Creating an array of Drawable objects
        Drawable[] drawables = new Drawable[3];
        drawables[0] = new Circles();
        drawables[1] = new Square();
        drawables[2] = new Triangles();
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }
}
