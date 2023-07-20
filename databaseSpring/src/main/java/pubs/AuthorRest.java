package pubs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

//@RestController
public class AuthorRest {
	@Autowired
	AuthorRepo ar;
	
	@Autowired
	TitleRepo tr;
   
	@GetMapping("/id")
	public List<String> getTitleById(@RequestParam("id") String id)
	{
		return ar.findTidByAuid(id);
	}
	
	
}
