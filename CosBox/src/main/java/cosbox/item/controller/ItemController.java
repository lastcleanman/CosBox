package cosbox.item.controller;

import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cosbox.item.dto.ItemVO;
import cosbox.item.service.ItemService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ItemController {
	
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	
	@Inject
	private ItemService itemService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/cosbox/item/itemList.do")
	public String itemList(Locale locale, Model model) throws Exception{

		logger.info("itemList");
		
		List<ItemVO> itemList = itemService.selectItemList();
		
		model.addAttribute("itemList", itemList);

		return "/item/itemList";
	}
	
}
