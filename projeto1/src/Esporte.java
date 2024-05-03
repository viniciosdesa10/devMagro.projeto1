import drible.Drible;
import futebol.Futebol;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Esporte {
    public static void main(String[] args) {
        esportebom();
        Futebol.chamarfutebol();
        Drible.chamarfuteboldrible();
        goldeplaca();

        }
        public static void esportebom(){
            System.out.println("ESPORTE É MUITO BOM!");
        }
        public static void goldeplaca(){
        System.out.println("NO FUTEBOL TEM GOL DE PLACA!");
        }

    }
