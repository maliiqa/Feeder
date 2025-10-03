public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(1000);
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        System.out.println((int) (Math.random() * 10) +  1);
        System.out.println(Math.random() < 0.05);
        f.simulateOneDay(22);
        System.out.println(f.getCurrentFood());
        f = new Feeder(250);
        System.out.println(f.simulateManyDays(10,5) + " day(s)");
        f = new Feeder(0);
        System.out.println(f.simulateManyDays(5,10) + " day(s)");
    }
}
