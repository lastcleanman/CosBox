package cosbox.item.service;

import java.util.List;

import cosbox.item.dto.ItemVO;

public interface ItemService {
	
	public List<ItemVO> selectItemList() throws Exception;
}
