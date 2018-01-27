package cosbox.item.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import cosbox.item.dto.ItemVO;

@Repository
public class ItemDAOImpl implements ItemDAO {

	@Inject
	private SqlSession sqlSession;
	
	private static final String Namespace = "cosbox.mapper.sqlItemMapper";
	
	@Override
	public List<ItemVO> selectItemList() throws Exception {

		return sqlSession.selectList(Namespace+".selectItemList");
	}

}
