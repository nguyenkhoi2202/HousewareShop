package com.example.housewareshop.repository;

import com.example.housewareshop.entity.Account;
import com.example.housewareshop.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImageRepository extends JpaRepository<Image,Integer> {
    @Query("select I from Image I where I.product.id= ?1")
    public List<Image> findAllByProductId(Long productId);
}
