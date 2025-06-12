package com.xmacedo.template_method;

public class PDFReport extends ReportGenerator {

    void collectData() {
        System.out.println("Collecting data for PDF [from PDFReport]!");
    }

    void formatReport() {
        System.out.println("Formatting PDF report [from PDFReport]");
    }
}
