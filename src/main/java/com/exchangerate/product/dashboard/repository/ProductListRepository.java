package com.exchangerate.product.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exchangerate.product.dashboard.model.ProductList;

@Repository
public interface ProductListRepository extends JpaRepository<ProductList, Long> {

	List<ProductList> findAllByItemName(String itemName);
}
