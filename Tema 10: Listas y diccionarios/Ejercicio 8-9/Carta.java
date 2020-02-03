package ej8t10;

import java.util.Objects;

public class Carta {

    private static String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
    private static int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
        12};
    private String palo;
    private Integer num;

    public Carta() {
        this.palo = palos[(int) (Math.random() * ((3 - 0) + 1)) + 0];
        this.num = nums[(int) (Math.random() * ((11 - 0) + 1)) + 0];
    }

    @Override
    public String toString() {
        String cartaObtenida = this.num + "";
        if (this.num == 10) {
            cartaObtenida = "Sota";
        }

        if (this.num == 11) {
            cartaObtenida = "Caballo";
        }

        if (this.num == 12) {
            cartaObtenida = "Rey";
        }
        return cartaObtenida + " de " + this.palo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Carta carta = (Carta) obj;
        return Objects.equals(palo, carta.palo)
                && Objects.equals(num, carta.num);
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int compareTo(Carta ca) {

        if (palo.equals(ca.getPalo())) {
            return num.compareTo(ca.getNum());
        } else {
            return palo.compareTo(ca.getPalo());
        }
    }

}
