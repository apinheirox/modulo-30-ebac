package br.dao;

import br.domain.Client;
import br.domain.Product;
import br.exception.DAOException;
import br.exception.KeyTypeNotFoundException;
import br.exception.MoreRegisterException;
import br.exception.TableException;

import java.util.Collection;

public class ProductDAOMock implements IProductDAO {
    @Override
    public Boolean register(Product entity) throws KeyTypeNotFoundException {
        return null;
    }

    @Override
    public void delete(String value) { }

    @Override
    public void change(Product entity) throws KeyTypeNotFoundException { }

    @Override
    public Product consult(String value) {
        Product product = new Product();
        product.setCode(value);
        return product;
    }

    @Override
    public Collection<Product> toFindAll() {
        return null;
    }
}
