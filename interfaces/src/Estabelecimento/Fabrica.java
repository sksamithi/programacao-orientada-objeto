package Estabelecimento;

import Equipamento.copiadora.Copiadora;
import Equipamento.digitalizadora.Digitalizadora;
import Equipamento.impressora.Deskjet;
import Equipamento.multifuncional.EquipamentoMultifuncional;
import Equipamento.impressora.Impressora;


public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();
        deskjet.imprimir();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
