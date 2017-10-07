package com.yourcodelab.service;

import java.util.List;
import com.yourcodelab.dao.ServicoDao;
import com.yourcodelab.model.Servico;

	public class ServicoService {
		private ServicoDao dao = new ServicoDao();
		
		public void inserirServico(Servico s){
			if(s != null)
				dao.inserir(s);
		}
		
		public List<Servico> listarTodos(){
			return dao.listarTodos();
		}
	
}
