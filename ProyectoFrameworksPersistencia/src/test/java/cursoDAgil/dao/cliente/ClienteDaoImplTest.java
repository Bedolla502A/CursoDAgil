package cursoDAgil.dao.cliente;
import static org.junit.Assert.*;
import java.util.List;
import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cursoDAgil.bd.domain.Cliente;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:*/applicationContext.xml"})
public class ClienteDaoImplTest {
	@Inject
	ClienteDao clienteDao;
	
	@Test
	public void pruebaConsultarTodo(){
		System.out.println("Test consultar todos los clientes");
		try{
			List<Cliente> lista = clienteDao.listarTodosClientes();
			assertEquals(lista.size(),3);
		}catch(Exception ex){
			System.out.println("error" + ex);
		}
	}
}
