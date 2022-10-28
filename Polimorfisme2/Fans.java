public class Fans {
    
    private String name;

    public Fans () {
        
    }

    public Fans (String name) {
        this.name = name;
    }

    public void showName () {
        System.out.print(name + ": ");
    }

    public void watchingPerformance () {
        showName();
        System.out.println("melihat idolanya dari youtube");
    }

    public void watchingPerformance (Musician musician) {
        showName();
        System.out.print("Melihat idolanya ");
        musician.perform();
    }

}