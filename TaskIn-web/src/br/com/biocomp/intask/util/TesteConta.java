package br.com.biocomp.intask.util;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.biocomp.intask.model.Conta;

/**
 * Created by leonardocordeiro on 24/02/17.
 */
public class TesteConta {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setTitular("Leonardo");
        conta.setBanco("Caixa Economica");
        conta.setAgencia("123");
        conta.setNumero("456");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("intask");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(conta);
        em.getTransaction().commit();

        em.close();
        emf.close();
    }
}
