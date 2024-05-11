package br.services;

import br.domain.Client;
import br.exception.DAOException;
import br.services.generic.IGenericService;

public interface IClientService extends IGenericService <Client, Long> {

    Client toFindByCode(Long code) throws DAOException;
}
