package com.xmacedo.template_method;


public class TemplateMethodExample {
    public static void main(String[] args) {
        System.out.println("Template Method");

        PDFReport pdfReport = new PDFReport();
        pdfReport.generateReport();

    }
}