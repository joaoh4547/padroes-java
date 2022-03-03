package com.github.joaoh4547.simple_factory.exporters;

import com.github.joaoh4547.simple_factory.entities.Product;
import com.github.joaoh4547.simple_factory.enums.ExportFileType;

import java.util.Collection;

public interface IProductListExporter {
    String openTable();

    String closeTable();

    String openLine();

    String closeLine();

    String closeTitlesLine();

    String openColum(String value);

    String closeColumn();

    String export(Collection<Product> products);

    static ProductListExporter getInstance() {
        return getInstance(ExportFileType.MARKDOWN);
    }

    static ProductListExporter getInstance(ExportFileType fileType) {
        switch (fileType) {
            case HTML -> {
                return new ProductListExporterHtml();
            }
            case MARKDOWN -> {
                return new ProductListExporterMarkDown();
            }
            default -> throw new IllegalArgumentException("Tipo de arquivo não suportado");
        }
    }

}
