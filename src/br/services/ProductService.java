package br.services;

import br.dao.IProductDAO;
import br.domain.Product;
import br.services.generic.GenericService;

public class ProductService extends GenericService <Product, String> implements IProductService {

    public ProductService (IProductDAO dao) {
        super(dao);
    }
}
