package TV;
public class usuario {
    
    public static void main(String[] args) throws Exception{

        SmartTv smarttv = new SmartTv();

        System.out.println("TV Ligada?" + smarttv.ligada);
        System.out.println("Canal atual ?" + smarttv.canal);
        System.out.println("Volume Atual?" + smarttv.volume);

        smarttv.ligar ();
        System.out.println("Tv ligada?" + smarttv.ligada);
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.diminuirVolume();
        smarttv.aumentarVolume();

        System.out.println("Volume Atual?" + smarttv.volume);
    }
}
