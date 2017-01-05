package com.wq.core.dao.product;

import com.wq.core.bean.product.Product;
import com.wq.core.query.product.ProductQuery;

import java.util.List;

/**
 * Created by 王萍 on 2017/1/4 0004.
 */
public interface ProductDao {
    public Integer getProductListCount(ProductQuery productQuery);

    public List<Product> getProductListWithPage(ProductQuery productQuery);
}
