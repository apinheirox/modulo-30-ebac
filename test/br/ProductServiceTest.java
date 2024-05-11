package br;

import br.dao.IProductDAO;
import br.dao.ProductDAOMock;
import br.domain.Product;
import br.exception.DAOException;
import br.exception.KeyTypeNotFoundException;
import br.services.IProductService;
import br.services.ProductService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class ProductServiceTest {


    private IProductService productService;
    private Product product;
    public ProductServiceTest() {
        IProductDAO dao = new ProductDAOMock();
        productService = new ProductService(dao);
    }

    @Before
    public void init() {
        product = new Product();
        product.setCode("A1");
        product.setName("Produto 1");
        product.setDescription("Produto 1");
        product.setValue(BigDecimal.TEN);
        product.setUnit("10");
    }

    @Test
    public void search() throws DAOException {
        Product producer = this.productService.consult(product.getCode());
        Assert.assertNotNull(producer);
    }

    @Test
    public void save() throws KeyTypeNotFoundException, DAOException {
        Boolean returned = productService.register(product);
        Assert.assertTrue(returned);
    }

    @Test
    public void delete() throws DAOException {
        productService.delete(product.getCode());
    }

    @Test
    public void updateClient() throws KeyTypeNotFoundException, DAOException {
        product.setName("João Lima");
        productService.change(product);

        Assert.assertEquals("João Lima", product.getName());
    }
}
