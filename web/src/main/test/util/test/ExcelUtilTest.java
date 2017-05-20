package util.test;

import java.util.LinkedHashMap;

import javax.inject.Inject;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.shop.www.dao.UserMapper;
import com.test.www.util.ExcelException;
import com.test.www.util.ExcelUitl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-dao.xml")

public class ExcelUtilTest {
	@Inject
	UserMapper userMapper;
	@Test
	public void test() throws ExcelException {
		LinkedHashMap<String,String> fieldMap=new LinkedHashMap<>();
		
		fieldMap.put("User.id", "User.id");
		fieldMap.put("User.username", "User.username");
		fieldMap.put("User.password", "User.password");
		fieldMap.put("User.phone", "User.phone");
		fieldMap.put("User.email", "User.email");
		fieldMap.put("User.created", "User.created");
		fieldMap.put("User.updated", "User.updated");
		
		String sheetName="sheetName";
		HttpServletResponse response = null;
		response.reset();
		response.setContentType("application/vnd.ms-excel"); // 改成输出excel文件
		response.setHeader("Content-disposition", "attachment; filename="
				+ "fileNameTest10086" + ".xls");
		ExcelUitl.listToExcel(userMapper.selectAll(), fieldMap, sheetName, response);
	}
}
