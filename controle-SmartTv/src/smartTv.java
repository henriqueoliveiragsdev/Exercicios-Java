public class smartTv{
    boolean statusTv = false;
    double canal = 1f;
    int volume = 25;

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume aumentado para: "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume reduzido para: "+ volume);
    }

    public void mudarCanal(double novoCanal){
        canal = novoCanal;
        System.out.println("Canal mudado para: "+ canal);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal mudado para: "+ canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Canal mudado para: "+ canal);
    }

    public void ligarTv(){
        statusTv = true;
    }

    public void desligarTv(){
        statusTv = false;
    }

}