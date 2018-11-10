package cn.com.iistudio.entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;


import java.util.Iterator;
import java.util.regex.Pattern;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;

import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;


import sun.misc.BASE64Decoder;


/**
 * @ClassName:UpImage
 * @Description:上传的头像实体类
 * @author:liuqi
 * @date:2018.11.8
 * @version:1.0
 *
 */
public class UpImage {
	
	//左上角在原图的x坐标
	String x;
	//左上角在原图的y坐标
	String y;
	String x2;	//右上角在原图的x坐标
	String y2;	//右上角在原图的y坐标
	String width;	//图片宽度
	String height;	//图片高度
	String base64;	//原图的base64编码
	
	
	/**
	 * @Description:获取左上角x
	 * @return String
	 */
	public String getX() {
		return x;
	}

	/**
	 * @Description:设置左上角x
	 * @return String
	 */
	public void setX(String x) {
		this.x = x;
	}

	/**
	 * @Description:获取左上角y
	 * @return String
	 */
	public String getY() {
		return y;
	}

	/**
	 * @Description:设置左上角y
	 * @return String
	 */
	public void setY(String y) {
		this.y = y;
	}

	/**
	 * @Description:获取右上角x
	 * @return String
	 */
	public String getX2() {
		return x2;
	}

	/**
	 * @Description:设置右上角x
	 * @return String
	 */
	public void setX2(String x2) {
		this.x2 = x2;
	}

	/**
	 * @Description:获取右上角y
	 * @return String
	 */
	public String getY2() {
		return y2;
	}

	/**
	 * @Description:设置右上角y
	 * @return String
	 */
	public void setY2(String y2) {
		this.y2 = y2;
	}

	/**
	 * @Description:获取高度
	 * @return String
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * @Description:获取x
	 * @return String
	 */
	public void setWidth(String width) {
		this.width = width;
	}

	/**
	 * @Description:获取x
	 * @return String
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @Description:设置高度
	 * @return String
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @Description:获取原图base64编码
	 * @return String
	 */
	public String getBase64() {
		return base64;
	}

	/**
	 * @Description:设置原图base64编码
	 * @return String
	 */
	public void setBase64(String imageBase64) {
		this.base64 = imageBase64;
	}
	

	/**
	 * 
	 * @Description:获取x
	 * @param:String path,String username(path是存放文件夹的路径，username是该头像用户的用户名)
	 * @return: String(存储失败时返回空字符串，成功后返回文件路径)
	 */
	
	public String base64ToWhere(String path,String username)
	{
		if(this.base64 == null)
			return "";
		else
		{
			
		try {   
			
                //去除不需要的字符串			    
			    String format = base64.split(",")[0];
			    //判断图片格式，获取图片格式
			    String regexPng = ".*png.*";
			    String regexJpg = ".*jpg.*";
			    String regexJpeg = ".*jpeg.*";
			    String suffix = null;
			    System.out.println("test----");
			    if(Pattern.matches(regexPng, format)) 
			    {
			    	username+=".png";
			    	suffix="png";
			    }
			    else if(Pattern.matches(regexJpg, format))
			    {
			    	username+=".jpg";
			    	suffix="jpg";
			    }
			    else if(Pattern.matches(regexJpeg, format))
			    {
			    	username+=".jpeg";
			    	suffix="jpeg";
			    }
			    
			 
			   //解析base64编码，转化为字节流
			    String base64 = this.base64.replace(format+",", "");
			  
		    	byte[] decoded = new BASE64Decoder().decodeBuffer(base64);
		    	
		    
		    	// 将字节数组转为InputStream，再转为MemoryCacheImageInputStream
				 ImageInputStream imageInputStream = new MemoryCacheImageInputStream(new ByteArrayInputStream(decoded));
				
				// 获取所有能识别数据流格式的ImageReader对象
				 Iterator<ImageReader> it = ImageIO.getImageReaders(imageInputStream);
				 ImageReader reader =it.next();
				 
			
				 reader.setInput(imageInputStream,true);
				 ImageReadParam param = reader.getDefaultReadParam();
				 
				 Rectangle rect = new Rectangle(Integer.parseInt(x),Integer.parseInt(y), Integer.parseInt(width),Integer.parseInt(height));
				 
				 param.setSourceRegion(rect); 
				 
				 BufferedImage bi = reader.read(0,param); 
				 File file = new File(path+username);
				 if(!file.exists())
				 {
					 file.createNewFile();
					 ImageIO.write(bi, suffix, file);  
				 }
				   //保存新图片
				 else
				 {
		          ImageIO.write(bi, suffix, file);  
				 }
//				File file = new File(path);
//				
//				FileImageOutputStream fileImageOutputStream = new FileImageOutputStream(file);
//				fileImageOutputStream.write(decoded,0,decoded.length);
//				
//
//				fileImageOutputStream.close();
				System.out.println(decoded);
				return path+username;
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		return "";
	}
	
}
