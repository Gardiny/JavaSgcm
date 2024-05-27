package br.ufac.sgcm.dao;

import java.util.List;

public interface IDao<T> {
    List<T> get();
    T get(Long id);
    List<T> get(String termoBusca);
    int insert(Object objeto);
    int update(Object objeto);
    int delete(Object objeto);

}