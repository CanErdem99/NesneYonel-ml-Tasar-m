package program.isbirimleri;
//subject
public class Eyleyici implements IEyleyici {
    @Override
    public void sogutucuAc() {
        System.out.println("Soğutucu Acıldı...");
    }

    @Override
    public void sogutucuKapat() {
        System.out.println("Soğutucu kapatıldı...");
    }
}