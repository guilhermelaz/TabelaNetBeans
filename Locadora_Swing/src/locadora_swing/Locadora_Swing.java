package locadora_swing;

import java.util.ArrayList;
import model.DaoVeiculo;
import model.Veiculo;
import view.VeiculoView;


public class Locadora_Swing {
    public static void main(String[] args) {
        System.out.println("OK");
        DaoVeiculo daoVeiculo = new DaoVeiculo();
        
        ArrayList<Veiculo> veiculos = daoVeiculo.buscarTodos();
        for(Veiculo v : veiculos){
            System.out.println(v.getModelo()  + " " + v.getMarca());
        }
        
        new VeiculoView().setVisible(true);
        
    }
}
