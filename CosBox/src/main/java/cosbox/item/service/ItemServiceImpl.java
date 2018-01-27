package cosbox.item.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import cosbox.item.dao.ItemDAO;
import cosbox.item.dto.ItemVO;

@Service
public class ItemServiceImpl implements ItemService {

	@Inject
	private ItemDAO itemDao;
	
	@Override
	public List<ItemVO> selectItemList() throws Exception {
		return itemDao.selectItemList();
	}

}
