public class media {
    public static void main (String[] args) {
        double notaA = 5.5;
        double notaB = 6.5;
        double media = (notaA + notaB) / 2;
        String output = String.format("A média entre %.1f e %.1f é igual à %.1f.", notaA, notaB, media);
        System.out.println(output);
    }
}
