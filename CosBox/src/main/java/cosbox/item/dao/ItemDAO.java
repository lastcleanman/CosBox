package cosbox.item.dao;

import java.util.List;

import cosbox.item.dto.ItemVO;

public interface ItemDAO {
	
	public List<ItemVO> selectItemList() throws Exception;
}
