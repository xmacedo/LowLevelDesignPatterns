package com.xmacedo.template_method;

public abstract class ReportGenerator {
    public final void generateReport() {
        collectData();
        formatReport();
        saveReport();
    }

    abstract void collectData();

    abstract void formatReport();

    void saveReport() {
        System.out.println("Saving report [from ReportGenerator]");
    }
}
