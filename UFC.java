
package ufc;
public class UFC {

    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Conor McGregor", "Irlanda",32, 1.75f , 70f, 22, 4 ,2 );
        l[1] = new Lutador ("Khabib Nurmagomedov", "Rússia", 31, 1.78f, 70f, 28, 0, 10);
        l[2] = new Lutador ("Israel Adesanya", "Nigéria", 30, 1.93f,83f, 18, 0, 4);
        l[3] = new Lutador ("Robert Whittaker", "Nova Zelândia", 29, 1.82f, 83.8f,  21, 5, 6);
        l[4] = new Lutador ("Stipe Miocic", "EUA", 37, 1.93f, 113f, 19, 3, 4);
        l[5] = new Lutador ("Daniel Cormier", "EUA", 41, 1.80f, 117.f, 22, 2, 7);
        
        l[2].apresentar();
        l[2].status();
        Luta UFC01 = new Luta();
        UFC01.marcarLuta(l[0],l[1]);
        UFC01.lutar();
        l[0].status();
        l[1].status();
        
    }
    
}
