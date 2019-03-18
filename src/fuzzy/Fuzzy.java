package fuzzy;

import javax.swing.JOptionPane;

public class Fuzzy {
    public static void main(String[] args) {
        Bebida coca = new CocaCola();
        Bebida pepsi = new PepsiCola();
        Bebida run = new Run();
        Gelo gelo = new Gelo();

        int tipo = JOptionPane.showConfirmDialog(null, "Sim: Coca-Cola\nNão ou Cancelar:Pepsi-Cola");
        double refriMl = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade do refrigerante(em ml): "));
        double runMl = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de run(em ml):"));
        double geloMl = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de gelo(em ml):"));

        Bebida refri = tipo == 0 ? coca : pepsi;
        String paladarRefri = refri.proporcaoMililitros(refriMl);
        String paladarRun = run.proporcaoMililitros(runMl);
        boolean geloCorreto = gelo.proporcaoEm(geloMl);

        boolean refriForte = paladarRefri.equalsIgnoreCase("forte");
        boolean refriSuave = paladarRefri.equalsIgnoreCase("suave");
        boolean refriFraco = paladarRefri.equalsIgnoreCase("fraco");

        boolean runForte = paladarRun.equalsIgnoreCase("forte");
        boolean runSuave = paladarRun.equalsIgnoreCase("suave");
        boolean runFraco = paladarRun.equalsIgnoreCase("fraco");

        boolean cubaSuave = (refriForte && runFraco && geloCorreto) || (refriSuave && runSuave && geloCorreto) || (refriFraco && runForte && geloCorreto);
        boolean cubaForte = (refriForte && runSuave && geloCorreto) || (refriForte && runForte && geloCorreto) || (refriSuave && runSuave && geloCorreto);
        boolean cubaFraco = (refriSuave && runFraco && geloCorreto) || (refriFraco && runSuave && geloCorreto) || (refriFraco && runSuave && geloCorreto);

        if (cubaSuave) {
            JOptionPane.showMessageDialog(null, "Cuba Livre Suave. Valor: R$20,00");
        } else if (cubaForte) {
            JOptionPane.showMessageDialog(null, "Cuba Livre Forte. Valor: R$25,00");
        } else if (cubaFraco) {
            JOptionPane.showMessageDialog(null, "Cuba Livre Fraca. Valor: R$15,00");
        } else {
            JOptionPane.showMessageDialog(null, "Não é Cuba Livre.");
        }
    }
}
