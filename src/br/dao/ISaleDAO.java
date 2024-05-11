package br.dao;

import br.dao.generic.IGenericDAO;
import br.domain.Sale;
import br.exception.DAOException;
import br.exception.KeyTypeNotFoundException;

public interface ISaleDAO extends IGenericDAO<Sale, String> {

    public void toFinishSale(Sale sale) throws KeyTypeNotFoundException, DAOException;
    public void toCancelSale(Sale sale) throws KeyTypeNotFoundException, DAOException;
}
