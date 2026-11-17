import javax.swing.JOptionPane;
import modelos.Veiculo;

public class Main {

    public static void main(String[] args) {
        Veiculo carro = new Veiculo();
        int km = Integer.parseInt(JOptionPane.showInputDialog("Digite os km percorido: "));
        int litros = Integer.parseInt(JOptionPane.showInputDialog("Digite os Litros consumidos: "));
        carro.setKm(km);
        carro.setLitros(litros);
        JOptionPane.showMessageDialog(null,"Consumo: "+ carro.getConsumo()+"km/l");
    }
}
