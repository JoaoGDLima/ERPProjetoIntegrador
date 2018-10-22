package model;

import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import model.util.Log;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.view.JasperViewer;

public class Report {

    public void exportarPDF(Map pMap, String pArquivo) {
        try {
            //JasperReport lRelatorio = JasperCompileManager.compileReport(getClass().getResourceAsStream("/hotel/relatorio/" + pArquivo + ".jrxml"));

            //JasperPrint lImpressao = JasperFillManager.fillReport(lRelatorio, pMap, ConexaoBD.getInstance().getConnection());
            //JRExporter lExportar = new JRPdfExporter();
            //lExportar.setParameter(JRExporterParameter.JASPER_PRINT, lImpressao);
            //lExportar.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream(pArquivo + ".pdf"));
            //lExportar.exportReport();
            //JOptionPane.showMessageDialog(null, "Arquivo Exportado!");
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
        }
    }

    public void exportPDFDir(JasperPrint pJasperPrint, String pDirectory, String pFileName) {
        try {
            JRExporter lExportar = new JRPdfExporter();
            lExportar.setParameter(JRExporterParameter.JASPER_PRINT, pJasperPrint);
            lExportar.setParameter(JRExporterParameter.OUTPUT_STREAM, new FileOutputStream(pDirectory + pFileName + ".pdf"));
            lExportar.exportReport();
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
        }
    }

    public void openFile(String pDirectory, String pFileName) {
        try {
            Desktop.getDesktop().open(new File(pDirectory + pFileName));
        } catch (Exception e) {
            Log.gravaLogException(this.getClass(), e);
        }
    }
}
