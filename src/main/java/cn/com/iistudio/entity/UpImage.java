package cn.com.iistudio.entity;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Base64;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageOutputStream;
import javax.imageio.stream.ImageInputStream;
import javax.imageio.stream.MemoryCacheImageInputStream;

import javafx.scene.image.Image;
import sun.misc.BASE64Decoder;

public class UpImage {
	
	String x;
	String y;
	String x2;
	String y2;
	String width;
	String height;
	String imageBase64;
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public String getY() {
		return y;
	}
	public void setY(String y) {
		this.y = y;
	}
	public String getX2() {
		return x2;
	}
	public void setX2(String x2) {
		this.x2 = x2;
	}
	public String getY2() {
		return y2;
	}
	public void setY2(String y2) {
		this.y2 = y2;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
	public String getImageBase64() {
		return imageBase64;
	}
	public void setImageBase64(String imageBase64) {
		this.imageBase64 = imageBase64;
	}
	
	//转码图片并剪切，保存图片
	public boolean base64ToWhere(String path)
	{
		if(this.imageBase64 == null)
			return false;
		else
		{
			
		try {   
			   //解析base64编码，转化为字节流
			    String base64 = this.imageBase64.replace("data:image/jpeg;base64,", "");
		    	byte[] decoded = new BASE64Decoder().decodeBuffer(base64);
		    	
		    	System.out.println("x:"+x+" y:"+y+" w:"+width+" h:"+height);
		    	// 将字节数组转为InputStream，再转为MemoryCacheImageInputStream
				 ImageInputStream imageInputStream = new MemoryCacheImageInputStream(new ByteArrayInputStream(decoded));
				// 获取所有能识别数据流格式的ImageReader对象
				 Iterator<ImageReader> it = ImageIO.getImageReaders(imageInputStream);
				 ImageReader reader = it.next(); 
				
				 reader.setInput(imageInputStream,true);
				 ImageReadParam param = reader.getDefaultReadParam();
				 
				 Rectangle rect = new Rectangle(Integer.parseInt(x),Integer.parseInt(y), Integer.parseInt(width),Integer.parseInt(height));
				 param.setSourceRegion(rect); 
				 
				 BufferedImage bi = reader.read(0,param); 
				 
				   //保存新图片 
		            ImageIO.write(bi, "jpg", new File(path));  
				 
//				File file = new File(path);
//				
//				FileImageOutputStream fileImageOutputStream = new FileImageOutputStream(file);
//				fileImageOutputStream.write(decoded,0,decoded.length);
//				
//
//				fileImageOutputStream.close();
				System.out.println(decoded);
				return true;
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}
		return false;
	}
	
}
