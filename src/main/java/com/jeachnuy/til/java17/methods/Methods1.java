package com.jeachnuy.til.java17.methods;

public class Methods1 {
    record Rectingle(int width, int height) {
        final boolean hasTheSameHeight(Rectingle this, final Rectingle rectingle) {
            return this.height == rectingle.height;
        }
    }

    public static void main(String[] args) {
        var rectangle1 = new Rectingle(2, 3);
        var rectangle2 = new Rectingle(4, 3);
        System.out.println(rectangle1.hasTheSameHeight(rectangle2));
    }
}
