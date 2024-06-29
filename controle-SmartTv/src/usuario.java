public class usuario {
    public static void main(String[] args) throws Exception {
        smartTv smartTv = new smartTv();

        System.out.println("Status da TV é: " + smartTv.statusTv);
        smartTv.ligarTv();
        System.out.println("Novo status da TV é: " + smartTv.statusTv);
        System.out.println("Volume atual da TV: " + smartTv.volume);
        System.out.println("Canal atual da TV: " + smartTv.canal);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println("Novo volume da TV é: " + smartTv.volume);

        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        System.out.println("Novo canal atual da TV: " + smartTv.canal);
        smartTv.mudarCanal(10.1);
        System.out.println("Novo canal atual da TV: " + smartTv.canal);

    }
}