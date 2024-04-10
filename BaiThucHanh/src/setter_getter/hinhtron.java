package setter_getter;

public class hinhtron {
    private final float pi=3.14f;
    private int r;
    public int getR()
    {
        return r;
    }
    public void setR(int a)
    {
        this.r=a;
    }
    public void tinhChuVi()
    {
        System.out.println("Chu vi la: "+ (2*r*pi));
    }
    public void tinhDienTich()
    {
        System.out.println("Dien tich la: "+ (pi*r*r));
    }
    public static void main(String[] args) {
        hinhtron ht= new hinhtron();
        ht.setR(5);
        ht.tinhChuVi();
        ht.tinhDienTich();
    }
}
