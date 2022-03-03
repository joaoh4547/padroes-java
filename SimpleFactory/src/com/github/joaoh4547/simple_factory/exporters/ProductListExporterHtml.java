package com.github.joaoh4547.simple_factory.exporters;

class ProductListExporterHtml extends ProductListExporter {
    @Override
    public String openTable() {
        return "<table>\n";
    }

    @Override
    public String closeTable() {
        return "</table>";
    }

    @Override
    public String openLine() {
        return "\t<tr>\n\t\t";
    }

    @Override
    public String closeLine() {
        return "</tr>\n";
    }

    @Override
    public String closeTitlesLine() {
        return "";
    }

    @Override
    public String openColum(String value) {
        return String.format("<td>%s", value);
    }

    @Override
    public String closeColumn() {
        return "</td>";
    }
}
