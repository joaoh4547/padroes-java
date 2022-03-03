package com.github.joaoh4547.simple_factory.exporters;

public class ProductListExporterHtml extends ProductListExporter{
    @Override
    public String openTable() {
        return "";
    }

    @Override
    public String closeTable() {
        return null;
    }

    @Override
    public String openLine() {
        return null;
    }

    @Override
    public String closeLine() {
        return null;
    }

    @Override
    public String closeTitlesLine() {
        return null;
    }

    @Override
    public String openColum(String value) {
        return null;
    }

    @Override
    public String closeColumn() {
        return null;
    }
}
