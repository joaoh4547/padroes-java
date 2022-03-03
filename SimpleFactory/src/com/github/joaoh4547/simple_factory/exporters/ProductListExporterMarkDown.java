package com.github.joaoh4547.simple_factory.exporters;

import java.util.Arrays;

public class ProductListExporterMarkDown extends ProductListExporter {
    @Override
    public String openTable() {
        return "";
    }

    @Override
    public String closeTable() {
        return "";
    }

    @Override
    public String openLine() {
        return "";
    }

    @Override
    public String closeLine() {
        return "";
    }

    @Override
    public String closeTitlesLine() {
        return generateLines(Arrays.asList("---", "---", "---"));
    }

    @Override
    public String openColum(String value) {
        return String.format("| %s",value);
    }

    @Override
    public String closeColumn() {
        return "";
    }
}
