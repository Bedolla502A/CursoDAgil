package cursoDAgil.dao.ganancias;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import cursoDAgil.bd.domain.Ganancias;
import cursoDAgil.bd.mappers.GananciasMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:*/applicationContext.xml"})
public class GananciasDaoImplTest {
	@Inject
	GananciasDao gananciasDao;
	
	@Test
	public void obtenerGanancias() {
		System.out.println("Test obtener ganancia");
		Ganancias ganancias = new Ganancias();
		try{
			//ganancias = gananciasDao.obtenerGanancias()
			//System.out.println("Las ganancias son: "+ );
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		
	}

	@Test
	public void nuevaGanancia(Ganancias ganancia) {
		Ganancias ganancias = new Ganancias();
		System.out.println("Test nueva ganancia");
		try{
			ganancias.setIdGanancia(34);
			ganancias.setSumaTotalGanancia(233.44);
			ganancias.setTotalGanancia(45.34);
			//ganancias.setFecha("23/03/2021");
			ganancias.setVentaId(78);
			gananciasDao.nuevaGanancia(ganancia);
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
	
	@Test
	public void obtenerGananciasPorFecha(){
		System.out.println("Test ganancias por fecha");
		try{
			List<Ganancias> lista=new ArrayList<Ganancias>();
			lista = gananciasDao.obtenerGananciasPorFecha("2018-06-29");
			System.out.println("Numero de ganancias: " + lista.size());
		}catch(Exception e){
			System.out.println("Error: " + e); 
		}
	}
	
	@Test
	public void obtenerTotalGanancias(){
		System.out.println("Test obtener total de ganancias");
		try{
			Ganancias totalGanancias =  gananciasDao.obtenerTotalGanancias();
			System.out.println("Ganancias: " + totalGanancias.getSumaTotalGanancia());
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}
}
