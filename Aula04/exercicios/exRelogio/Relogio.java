package exercicios.exRelogio;

public class Relogio {
    private int hora, min, seg;

    //Construtor
    Relogio(int hora, int min, int seg){
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }

    //metodos
    public void exibirHora(){
        System.out.println(hora + ":" + min + ":" + seg);
        //System.out.printf("%i2:%d2:%d2" , hora , min , seg);
    }

    public void avancaHora(){
        if (seg < 59){
            seg++;
        } else {
            seg = 0;
            if (min < 59){
                min++;
            } else {
                min = 0;
                if (hora < 24){
                    hora++;
                } else {
                    hora = 0;
                }
            }
        }
    }

    public void retrocedeHora(){
        if (seg > 0){
            seg--;
        } else {
            seg = 59;
            if (min > 0){
                min--;
            } else {
                min = 59;
                if (hora > 0){
                    hora--;
                } else {
                    hora = 23;
                }
            }
        }
    }
}