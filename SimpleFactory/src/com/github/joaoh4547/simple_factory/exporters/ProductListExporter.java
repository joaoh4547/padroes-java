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
        generateLines(COLUMNS_TITLES, builder);
        generateProductsLines(products, builder);
        builder.append(closeTable());
        return builder.toString();
    }

    private void generateProductsLines(Collection<Product> products, StringBuilder builder) {
        for (Product product : products) {

            Collection<String> values = Arrays.asList(
                    product.getId().toString(),
                    product.getDescription(),
                    product.getValue().toString()
            );
            generateLines(values, builder);
        }
    }

    private void generateLines(Collection<String> values, StringBuilder builder) {
        builder.append(openLine());
        for (String title : values) {
            builder.append(openColum(title));
            builder.append(closeColumn());
        }
        builder.append(closeLine());
    }
}
