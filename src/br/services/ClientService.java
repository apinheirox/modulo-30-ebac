package br.services;

import br.dao.IClientDAO;
import br.domain.Client;
import br.exception.DAOException;
import br.exception.MoreRegisterException;
import br.exception.TableException;
import br.services.generic.GenericService;

public class ClientService extends GenericService <Client, Long> implements IClientService {

    public ClientService(IClientDAO clientDAO) {
        super(clientDAO);
    }
    @Override
    public Client toFindByCode(Long code) throws DAOException {
        try {
            return this.dao.consult(code);
        } catch (MoreRegisterException | TableException e) {
            e.printStackTrace();
        }
        return null;
    }
}
