package com.github.joaoh4547.simple_factory.exporters;

import com.github.joaoh4547.simple_factory.entities.Product;

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

}
