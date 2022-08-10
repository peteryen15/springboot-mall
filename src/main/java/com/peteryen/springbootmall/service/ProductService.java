package com.peteryen.springbootmall.service;

import com.peteryen.springbootmall.dto.ProductQueryParams;
import com.peteryen.springbootmall.dto.ProductRequest;
import com.peteryen.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
