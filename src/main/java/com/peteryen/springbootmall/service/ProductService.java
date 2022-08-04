package com.peteryen.springbootmall.service;

import com.peteryen.springbootmall.dto.ProductRequest;
import com.peteryen.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
