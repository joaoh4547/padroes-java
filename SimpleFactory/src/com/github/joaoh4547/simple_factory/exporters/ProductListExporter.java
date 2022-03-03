package com.github.joaoh4547.simple_factory.exporters;

import com.github.joaoh4547.simple_factory.entities.Product;

import java.util.Arrays;
import java.util.Collection;

public abstract class ProductListExporter implements IProductListExporter {

    protected static final Collection<String> COLUMNS_TITLES = Arrays.asList("Id", "Descrição", "Preço");

    @Override
    public final String export(Collection<Product> products) {
        StringBuilder builder = new StringBuilder();

        builder.append(openTable());
        builder.append(generateLines(COLUMNS_TITLES));
        generateProductsLines(products);
        builder.append(closeTable());
        return builder.toString();
    }

    private void generateProductsLines(Collection<Product> products) {
        for (Product product : products) {

            Collection<String> values = Arrays.asList(
                    product.getId().toString(),
                    product.getDescription(),
                    product.getValue().toString()
            );
            generateLines(values);
        }
    }

    protected String generateLines(Collection<String> values) {
        StringBuilder builder = new StringBuilder();
        builder.append(openLine());
        for (String title : values) {
            builder.append(openColum(title));
            builder.append(closeColumn());
        }
        builder.append(closeLine());
        return builder.toString();
    }
}
