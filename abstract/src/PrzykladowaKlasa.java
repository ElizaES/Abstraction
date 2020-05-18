public class PrzykladowaKlasa implements PrzykladowyInterfejs, InnyInterfejs{
    @Override
    public void przykladowaMetoda() {
        System.out.println("Implementacja przykladowejMetody");
    }

    @Override
    public void innaMetoda() {
        System.out.println("Implementacja innejMetody");
    }
}
