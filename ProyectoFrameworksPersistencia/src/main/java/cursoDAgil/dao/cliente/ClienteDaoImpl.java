package cursoDAgil.dao.cliente;

import java.io.Serializable;

import java.util.List;

import javax.inject.Named;

import org.apache.ibatis.session.SqlSession;
import cursoDAgil.bd.domain.Cliente;
import cursoDAgil.bd.mappers.ClienteMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Named
public class ClienteDaoImpl implements ClienteDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	SqlSession sqlSession;
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Cliente> listarTodosClientes() {
		// TODO Auto-generated method stub
		List<Cliente> list = null;
		try{
			ClienteMapper clienteMapper = sqlSession.getMapper(ClienteMapper.class);
			list = clienteMapper.listarTodosClientes();
			for(Cliente c:list){
				System.out.println("Id: " + c.getId());
				System.out.println("Nombre: " + c.getNombre());
			}
			return list;
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		return null;
	}
}
