package com.github.joaoh4547.simple_factory;

import com.github.joaoh4547.simple_factory.entities.Product;
import com.github.joaoh4547.simple_factory.enums.ExportFileType;
import com.github.joaoh4547.simple_factory.exporters.IProductListExporter;

import java.util.Arrays;
import java.util.Collection;

public class Application {



    public static void main(String[] args) {
        IProductListExporter exporter = IProductListExporter.getInstance(ExportFileType.MARKDOWN);
        System.out.println(exporter.export(Arrays.asList(
                new Product(1L, "TV", 1500D),
                new Product(2L, "Geladeira", 3700D)
        )));

    }


}
