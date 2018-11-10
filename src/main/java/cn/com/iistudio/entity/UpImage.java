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
 * @Description:�ϴ���ͷ��ʵ����
 * @author:liuqi
 * @date:2018.11.8
 * @version:1.0
 *
 */
public class UpImage {
	
	//���Ͻ���ԭͼ��x����
	String x;
	//���Ͻ���ԭͼ��y����
	String y;
	String x2;	//���Ͻ���ԭͼ��x����
	String y2;	//���Ͻ���ԭͼ��y����
	String width;	//ͼƬ���
	String height;	//ͼƬ�߶�
	String base64;	//ԭͼ��base64����
	
	
	/**
	 * @Description:��ȡ���Ͻ�x
	 * @return String
	 */
	public String getX() {
		return x;
	}

	/**
	 * @Description:�������Ͻ�x
	 * @return String
	 */
	public void setX(String x) {
		this.x = x;
	}

	/**
	 * @Description:��ȡ���Ͻ�y
	 * @return String
	 */
	public String getY() {
		return y;
	}

	/**
	 * @Description:�������Ͻ�y
	 * @return String
	 */
	public void setY(String y) {
		this.y = y;
	}

	/**
	 * @Description:��ȡ���Ͻ�x
	 * @return String
	 */
	public String getX2() {
		return x2;
	}

	/**
	 * @Description:�������Ͻ�x
	 * @return String
	 */
	public void setX2(String x2) {
		this.x2 = x2;
	}

	/**
	 * @Description:��ȡ���Ͻ�y
	 * @return String
	 */
	public String getY2() {
		return y2;
	}

	/**
	 * @Description:�������Ͻ�y
	 * @return String
	 */
	public void setY2(String y2) {
		this.y2 = y2;
	}

	/**
	 * @Description:��ȡ�߶�
	 * @return String
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * @Description:��ȡx
	 * @return String
	 */
	public void setWidth(String width) {
		this.width = width;
	}

	/**
	 * @Description:��ȡx
	 * @return String
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * @Description:���ø߶�
	 * @return String
	 */
	public void setHeight(String height) {
		this.height = height;
	}

	/**
	 * @Description:��ȡԭͼbase64����
	 * @return String
	 */
	public String getBase64() {
		return base64;
	}

	/**
	 * @Description:����ԭͼbase64����
	 * @return String
	 */
	public void setBase64(String imageBase64) {
		this.base64 = imageBase64;
	}
	

	/**
	 * 
	 * @Description:��ȡx
	 * @param:String path,String username(path�Ǵ���ļ��е�·����username�Ǹ�ͷ���û����û���)
	 * @return: String(�洢ʧ��ʱ���ؿ��ַ������ɹ��󷵻��ļ�·��)
	 */
	
	public String base64ToWhere(String path,String username)
	{
		if(this.base64 == null)
			return "";
		else
		{
			
		try {   
			
                //ȥ������Ҫ���ַ���			    
			    String format = base64.split(",")[0];
			    //�ж�ͼƬ��ʽ����ȡͼƬ��ʽ
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
			    
			 
			   //����base64���룬ת��Ϊ�ֽ���
			    String base64 = this.base64.replace(format+",", "");
			  
		    	byte[] decoded = new BASE64Decoder().decodeBuffer(base64);
		    	
		    
		    	// ���ֽ�����תΪInputStream����תΪMemoryCacheImageInputStream
				 ImageInputStream imageInputStream = new MemoryCacheImageInputStream(new ByteArrayInputStream(decoded));
				
				// ��ȡ������ʶ����������ʽ��ImageReader����
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
				   //������ͼƬ
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
