package cursoDAgil.controlador;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.bd.mappers.ClienteMapper;

public class ConsultaServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7576686705278155784L;


	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		InputStream inputStream= getServletContext().getResourceAsStream("/WEB-INF/mybatis-config.xml");
				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

				SqlSession sqlSession = sqlSessionFactory.openSession();
				//ayuda a administrar  el pool de conexiones

				ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
				//indicamos que la sesión se trabajara con la interfaz de ClienteMappers.

				List<Cliente> list = clienteMapper.listarTodosClientes();
				for (Cliente c : list){
					System.out.println("Id: " + c.getId());
					System.out.println("Nombre: " + c.getNombre());
					System.out.println("Email: "+ c.getEmail());
					System.out.println("Sexo: " + c.getSexo());
				}
				sqlSession.close();
	}
}
