package projeto.crud.crud.settings;

import org.modelmapper.ModelMapper;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zkoss.zk.au.http.DHtmlUpdateServlet;
import org.zkoss.zk.ui.http.DHtmlLayoutServlet;
import org.zkoss.zk.ui.http.HttpSessionListener;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class ZKServletConfiguration {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}	
	@Bean
	public ServletRegistrationBean<DHtmlLayoutServlet> dHtmlLayoutServlet() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("update-uri", "/zkau");
		ServletRegistrationBean<DHtmlLayoutServlet> reg = new ServletRegistrationBean<DHtmlLayoutServlet>(
				new DHtmlLayoutServlet(), "*.zul");
		reg.setLoadOnStartup(1);
		reg.setInitParameters(params);
		return reg;
	}

	@Bean
	public ServletRegistrationBean<DHtmlUpdateServlet> dHtmlUpdateServlet() {
		Map<String, String> params = new HashMap<String, String>();
		params.put("update-uri", "/zkau/*");
		ServletRegistrationBean<DHtmlUpdateServlet> reg = new ServletRegistrationBean<DHtmlUpdateServlet>(
				new DHtmlUpdateServlet(), "/zkau/*");
		reg.setLoadOnStartup(2);
		reg.setInitParameters(params);
		return reg;
	}

	@Bean
	public HttpSessionListener httpSessionListener() {
		return new HttpSessionListener();
	}

}
