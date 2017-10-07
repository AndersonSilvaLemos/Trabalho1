package com.yourcodelab.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yourcodelab.model.Servico;
import com.yourcodelab.service.ServicoService;

/**
 * Servlet implementation class InserirServicoServlet
 */
@WebServlet("/InserirServicoServlet")
public class InserirServicoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		ServicoService control = new ServicoService();
		
		//Obter parãmetros do formulário
		String serial = request.getParameter("serial");
		String data = request.getParameter("data");
		String hora = request.getParameter("hora");
		String descricaoDefeito = request.getParameter("descricaoDefeito");
		String valorConserto = request.getParameter("valorConserto");
		String status = request.getParameter("status");
		
		//Instanciar objeto servico, o custo precisa ser convertido de String para float
		Servico s = new Servico(new Integer(0), serial, data, hora, descricaoDefeito , 
				Float.parseFloat(valorConserto) , status);
				
		//Invocar a camada de negócio
		control.inserirServico(s);
		
		//Obter a lista atualizada de Clientes
		List<Servico> lista = control.listarTodos();
		
		if(lista == null)
			lista = new ArrayList<Servico>();
		
		request.setAttribute("listaServico", lista);
		
		String nextJSP = "/servico/listarServico.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(request, response);
	}

}
