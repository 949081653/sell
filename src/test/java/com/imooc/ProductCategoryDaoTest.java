package com.imooc;

import com.imooc.dataobject.ProductCategory;
import com.imooc.repository.ProductCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Optional;

/**
 * @program: sell
 * @description:
 * @author: Mr.Liu
 * @create: 2018-11-09 14:36
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryDaoTest {
    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory();
        productCategory.setCategoryName("女生最爱");
        productCategory.setCategoryType(2);
        repository.save(productCategory);
    }

    @Test
    @Transactional
    public void updateTest(){
        Optional<ProductCategory> productCategory = repository.findById(4);

        System.out.println(productCategory);
        productCategory.get().setCategoryType(13);
        repository.save(productCategory.get());
    }
}
