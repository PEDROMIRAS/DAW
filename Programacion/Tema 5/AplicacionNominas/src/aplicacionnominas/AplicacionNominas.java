/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionnominas;
import javax.swing.JOptionPane;

public class AplicacionNominas {
    
    public static double pagasExtraProrrateadas(int salarioBase) {
        return 2 * (salarioBase / 12.0);
    }

    public static double salarioBruto(int salarioBase, int plusConvenio, int dietas, int horasExtra, int plusTransporte, int incentivo, double pagasExtra, boolean incluirPagas) {
        // Sumar las pagas extra si están prorrateadas
        return salarioBase + plusConvenio + dietas + horasExtra + plusTransporte + incentivo + (incluirPagas ? pagasExtra : 0);
    }

    public static double BCCC(int salarioBase, int plusConvenio, int plusTransporte , int incentivo, double pagasExtra) {
        return salarioBase + plusConvenio + plusTransporte + incentivo + pagasExtra;
    }

    public static double BCCP(int salarioBase, int plusConvenio, int plusTransporte, int incentivo, double pagasExtra, int horasExtra) {
        return salarioBase + plusConvenio + plusTransporte + incentivo + pagasExtra + horasExtra;
    }

    public static double deducciones(double ss, double desempleo, double fp, double tHorasExtra, int IRPF, 
                                     double bccc, double bccp, int horasExtra) {
        double ssF = (bccc * ss);
        double desempleoF = (bccp * desempleo);
        double fpF = (bccp * fp);
        double tHE = (horasExtra * tHorasExtra);
        double IRPFf = (bccp * IRPF)/100;

        return ssF + desempleoF + fpF + tHE + IRPFf;
    }

    public static double salarioNeto(double salarioBruto, double deducciones) {
        return salarioBruto - deducciones;
    }

    public static void main(String[] args) {

        final double ss = 0.0482;
        final double desempleo = 0.0155;
        final double fp = 0.001;
        final double tHorasExtra = 0.047;

//        System.out.println("Ingrese los valores necesarios:");
//        System.out.print("Salario Base: ");
//        int salarioBase = sc.nextInt(); //1320
//        System.out.print("Plus Transporte: ");
//        int plusTransporte = sc.nextInt(); //120
//        System.out.print("Plus Convenio: ");
//        int plusConvenio = sc.nextInt();//150
//        System.out.print("Horas Extra: ");
//        int horasExtra = sc.nextInt();//100
//        System.out.print("Dietas: ");
//        int dietas = sc.nextInt();//140
//        System.out.print("Incentivos: ");
//        int incentivo = sc.nextInt();
//        System.out.print("IRPF (%): ");
//        int IRPF = sc.nextInt();//8
//
//        System.out.print("Se cobran las pagas extra prorrateadas? (true/false): ");
//        boolean incluirPagas = sc.nextBoolean();

//        double pagasExtra = pagasExtraProrrateadas(salarioBase);
//        double salarioBruto = salarioBruto(salarioBase, plusConvenio, dietas, horasExtra, plusTransporte, incentivo, pagasExtra, incluirPagas);
//        double bccc = BCCC(salarioBase, plusConvenio, plusTransporte, incentivo, pagasExtra);
//        double bccp = BCCP(salarioBase, plusConvenio, plusTransporte,incentivo, pagasExtra, horasExtra);
//        double deduccionesTotales = deducciones(ss, desempleo, fp, tHorasExtra, IRPF, bccc, bccp, horasExtra);
//        double salarioNeto = salarioNeto(salarioBruto, deduccionesTotales);

//        System.out.println("\nResultados:");
//        System.out.println("Salario Bruto: " + salarioBruto);
//        System.out.println("Pagas Extra Prorrateadas: " + pagasExtra);
//        System.out.println("Base de Cotizacion Comun (BCCC): " + bccc);
//        System.out.println("Base de Cotizacion para el Paro (BCCP): " + bccp);
//        System.out.println("Deducciones Totales: " + deduccionesTotales);
//        System.out.println("-------------------------");
//        System.out.println("Salario Neto: " + salarioNeto);
        
        JOptionPane.showMessageDialog(null,"Ingrese los valores necesarios ");
        int salarioBase = Integer.parseInt(JOptionPane.showInputDialog("Introducir el salario base: "));
        int plusTransporte = Integer.parseInt(JOptionPane.showInputDialog("Introduce el plus transporte: "));
        int plusConvenio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el plus convenio: "));
        int horasExtra = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas extra: "));
        int dietas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las dietas: "));
        int incentivo = Integer.parseInt(JOptionPane.showInputDialog("Introduce los incentivos: "));
        int IRPF = Integer.parseInt(JOptionPane.showInputDialog("Introduce el IRPF(%): "));
        
        int respuesta = JOptionPane.showConfirmDialog(null, 
                "¿Se cobran las pagas extra prorrateadas?", 
                "Confirmación", 
                JOptionPane.YES_NO_OPTION);
            boolean incluirPagas = (respuesta == JOptionPane.YES_OPTION);
        
        double pagasExtra = pagasExtraProrrateadas(salarioBase);
        double salarioBruto = salarioBruto(salarioBase, plusConvenio, dietas, horasExtra, plusTransporte, incentivo, pagasExtra, incluirPagas);
        double bccc = BCCC(salarioBase, plusConvenio, plusTransporte, incentivo, pagasExtra);
        double bccp = BCCP(salarioBase, plusConvenio, plusTransporte,incentivo, pagasExtra, horasExtra);
        double deduccionesTotales = deducciones(ss, desempleo, fp, tHorasExtra, IRPF, bccc, bccp, horasExtra);
        double salarioNeto = salarioNeto(salarioBruto, deduccionesTotales);
        
//        JOptionPane.showMessageDialog(null, "Resultados de la nomina:");
//        JOptionPane.showMessageDialog(null, "Salario Bruto: "+salarioBruto);
//        JOptionPane.showMessageDialog(null, "BCCC: "+bccc);
//        JOptionPane.showMessageDialog(null, "BCCP: "+bccp );
//        JOptionPane.showMessageDialog(null, "Deducciones Totales: "+deduccionesTotales);
//        JOptionPane.showMessageDialog(null, "Salario Neto: "+ salarioNeto);
//        
        JOptionPane.showMessageDialog(null, 
                "Resultados de la nomina:"+
                "\nSalario Bruto: "+salarioBruto+
                "\nBCCC: "+bccc+
                "\nBCCP: "+bccp+
                "\nDeducciones Totales: "+deduccionesTotales+
                "\nSalario Neto: "+ salarioNeto);
  
    }
}