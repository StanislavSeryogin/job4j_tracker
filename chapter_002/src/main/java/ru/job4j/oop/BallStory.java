package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();

        ball.tryEat(ball);
        hare.tryEat(hare);
        wolf.tryEat(wolf);
        fox.tryEat(fox);
    }
}
