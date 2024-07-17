package Equipamento.multifuncional;
import Equipamento.copiadora.Copiadora;
import Equipamento.digitalizadora.Digitalizadora;
import Equipamento.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora{
    public void copiar() {
        System.out.println("Copiando por multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando por multifuncional");        
    }

    public void imprimir() {
        System.out.println("Imprimindo por multifuncional");        
    }

}
