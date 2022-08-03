package com.peteryen.springbootmall.dao;

import com.peteryen.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
