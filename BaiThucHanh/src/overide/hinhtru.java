package overide;

public class hinhtru extends hinhtron{
    @Override
    public void xuatThongTin()
    {
        System.out.println("Day la hinh tru");
    }
    public static void main(String[] args) {
        hinhtron htron= new hinhtron();
        hinhtru htru= new hinhtru();
        htron.xuatThongTin();
        htru.xuatThongTin();
    }
}

