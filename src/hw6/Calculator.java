package hw6;

public class Calculator {
    private int x;
    private int y;

    public void setX(int x) throws CalException {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) throws CalException {
        if (y > 0) {
            this.y = y;
        } else if (x == 0 && y == 0) {
            throw new CalException("0的0次方沒有意義");
        } else if (y < 0) {
            throw new CalException("次方負值，結果回傳不為整數!");
        }

    }

    public int getY() {
        return y;
    }

    public void powerXY() {
        int result = (int) Math.pow(x, y);
        System.out.println(x + "的" + y + "次方等於" + result);
//        return (int) Math.pow(x, y);
    }
}
