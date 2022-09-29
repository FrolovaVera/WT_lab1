import java.util.ArrayList;

enum Color{ RED, GREEN, BLUE,}
class Ball{
    public Ball(double weight, Color color){
        this.weight = weight;
        this.color = color;

    }
    public double getWeight() { return weight; }
    public Color getColor() { return color; }
    private double weight;
    private Color color;
}

class Basket{

    public void addBall(Ball ball){
        basket.add(ball);
    }

    public double getWeight(){
        double weight = 0.0;
        for (Ball b : basket){
            weight += b.getWeight();
        }
        return weight;
    }

    public int countBlueBalls(){
        int count = 0;
        for (Ball b : basket){
            if (b.getColor() == Color.BLUE){
                count++;
            }
        }
        return count;
    }
    private ArrayList<Ball> basket = new ArrayList<Ball>();
}

public class Task9 {
    public static void main(String[] args){
        Ball ball1 = new Ball(34.50, Color.RED);
        Ball ball2 = new Ball(49.30, Color.BLUE);
        Ball ball3 = new Ball(11.24, Color.GREEN);
        Ball ball4 = new Ball(49.30, Color.BLUE);
        Ball ball5 = new Ball(49.30, Color.BLUE);

        Basket basket = new Basket();
        basket.addBall(ball1);
        basket.addBall(ball2);
        basket.addBall(ball3);
        basket.addBall(ball4);
        basket.addBall(ball5);

        System.out.println("Total ball weight in basket: " + basket.getWeight() + "kg");
        System.out.println("Total number of blue balls in basket: " + basket.countBlueBalls());
    }
}
