abstract class Ciasto {
    protected Jablko algorytmJablko;
    protected Sliwka algorytmSliwka;

    public void setAlgorytmJablko(Jablko algorytmJablko) {
        this.algorytmJablko = algorytmJablko;
    }

    public void setAlgorytmSliwka(Sliwka algorytmSliwka) {
        this.algorytmSliwka = algorytmSliwka;
    }

    public abstract void przygotujCiasto();
}