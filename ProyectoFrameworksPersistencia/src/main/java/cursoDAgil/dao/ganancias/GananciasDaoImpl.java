package cursoDAgil.dao.ganancias;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import cursoDAgil.bd.domain.Ganancias;
import cursoDAgil.bd.mappers.GananciasMapper;

public class GananciasDaoImpl implements GananciasDao, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4949012722114610782L;
	SqlSession sqlSession;
	
	@Autowired
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	@Override
	public List<Ganancias> obtenerGanancias() {
		// TODO Auto-generated method stub
		List<Ganancias> lista=null;
		try{
			GananciasMapper gananciaMapper = sqlSession.getMapper(GananciasMapper.class);
			lista = gananciaMapper.obtenerGanancias();
			return lista;
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		return lista;
	}

	@Override
	public void nuevaGanancia(Ganancias ganancia) {
		// TODO Auto-generated method stub
		try{
			GananciasMapper gananciaMapper = sqlSession.getMapper(GananciasMapper.class);
			System.out.println("ganancia creada con exito");
			gananciaMapper.nuevaGanancia(ganancia);
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
	}

	@Override
	public List<Ganancias> obtenerGananciasPorFecha(String fecha) {
		// TODO Auto-generated method stub
		List<Ganancias> lista=null;
		try{
			GananciasMapper gananciaMapper = sqlSession.getMapper(GananciasMapper.class);
			lista = gananciaMapper.obtenerGananciasPorFecha(fecha);
			return lista;
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		return lista;
	}

	@Override
	public Ganancias obtenerGananciasTotal() {
		// TODO Auto-generated method stub
		Ganancias gananciasTotal=null;
		try{
			GananciasMapper gananciaMapper = sqlSession.getMapper(GananciasMapper.class);
			gananciasTotal = gananciaMapper.obtenerGananciasTotal();
			return gananciasTotal;
		}catch(Exception e){
			System.out.println("Error: " + e);
		}
		return gananciasTotal;
	}
	
}
