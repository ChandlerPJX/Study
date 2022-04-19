package BookDemo;

public class GetNumbers {

    public int getWan(int n) {
        int a = n / 1_0000;
        return a;
    }

    public int getQian(int n) {
        int a = n / 1_0000;
        int b = (n - a * 1_0000) / 1000;
        return b;
    }

    public int getBai(int n) {
        int a = n / 1_0000;
        int b = (n - a * 1_0000) / 1000;
        int c = (n - a * 1_0000 - b * 1000) / 100;
        return c;
    }

    public int getShi(int n) {
        int a = n / 1_0000;
        int b = (n - a * 1_0000) / 1000;
        int c = (n - a * 1_0000 - b * 1000) / 100;
        int d = (n - a * 1_0000 - b * 1000 - c * 100) / 10;
        return d;
    }

    public int getGe(int n) {
        int a = n / 1_0000;
        int b = (n - a * 1_0000) / 1000;
        int c = (n - a * 1_0000 - b * 1000) / 100;
        int d = (n - a * 1_0000 - b * 1000 - c * 100) / 10;
        int e = n - a * 1_0000 - b * 1000 - c * 100 - d * 10;
        return e;
    }

    public int getReverse(int i) {

        int revx = 0;
        while (i != 0) {
            revx = revx * 10 + i % 10;
            i = i / 10;
        }
        return revx;
    }

}
