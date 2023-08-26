package classwork.chapter3;

public class TypeLong {
    public static void main(String[] args) {
        int lightspeed = 186000;
        long days = 1000;
        long seconds;
        long distance;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("for" +  days);
        System.out.print("=");
        System.out.print(distance +  "mile");
    }
}
