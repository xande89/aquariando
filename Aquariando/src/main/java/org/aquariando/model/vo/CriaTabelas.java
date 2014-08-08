package org.aquariando.model.vo;

import javax.persistence.Persistence;

public class CriaTabelas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persistence.createEntityManagerFactory("AQUARIO");
		Persistence.createEntityManagerFactory("EQUIPAMENTO");
		Persistence.createEntityManagerFactory("FAUNA");
		Persistence.createEntityManagerFactory("FILTRAGEM");
		Persistence.createEntityManagerFactory("FLORA");
		Persistence.createEntityManagerFactory("ILUMINACAO");
		Persistence.createEntityManagerFactory("PARAMETRO");
		Persistence.createEntityManagerFactory("SUPRIMENTO");
	}

}
