public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual ? " + smartTv.volume);

        System.out.println("Canal atual ? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual ? " + smartTv.canal);

        System.out.println("Tv esta ligada ? " + smartTv.ligado);
        System.out.println("Canal atual ? " + smartTv.canal);
        System.out.println("Volume atual ? " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Tv esta ligada > Novo status " + smartTv.ligado);

        smartTv.desligar();
        System.out.println("Tv esta ligada > Novo status " + smartTv.ligado);
    }
}
