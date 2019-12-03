package edu.hubu.learn.config;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.hubu.learn.util.FileConstant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @moduleName WebMvcConfig
 * @description web 配置类
 *
 * @author 杨睿
 */
@Configuration
public class WebMvcConfig extends WebMvcConfigurationSupport {

  /**
   * 配置存放用户头像的路径
   * 绝对路径
   */
  private static final String USER_IMAGES_PATH = "file:" + FileConstant.UPLOAD_PATH + FileConstant.IMG_FILE_NAME;

  /**
   * 配置存放视频的绝对路径
   */
  private static final String VIDEO_PATH = "file:" + FileConstant.UPLOAD_PATH + FileConstant.VIDEO_PATH;

  /**
   * 加载静态资源
   */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    //添加图片映射，将所有访问 /userImages/** 的请求映射到 存放用户头像的文件夹下
    registry.addResourceHandler(FileConstant.VIRTUAL_IMG_PATH).addResourceLocations(USER_IMAGES_PATH);
    //添加视频映射，将所有访问 /video/** 的请求映射到 存放用户头像的文件夹下
    registry.addResourceHandler(FileConstant.VIRTUAL_VIDEO_PATH).addResourceLocations(VIDEO_PATH);
  }

  /**
   * 解决跨域问题
   */
  @Override
  protected void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedMethods("*")
        .allowedOrigins("*")
        .allowedHeaders("*");
  }

  /**
   * 定义时间格式转换器
   */
  @Bean
  public MappingJackson2HttpMessageConverter jackson2HttpMessageConverter() {
    MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
    ObjectMapper mapper = new ObjectMapper();
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    mapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm"));
    converter.setObjectMapper(mapper);
    return converter;
  }

  /**
   * 添加转换器
   */
  @Override
  public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
    //将我们定义的时间格式转换器添加到转换器列表中,
    //这样jackson格式化时候但凡遇到Date类型就会转换成我们定义的格式
    converters.add(jackson2HttpMessageConverter());
  }
}
