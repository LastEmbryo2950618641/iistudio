package cn.com.iistudio.service.serviceinter;

/**
 * @Description:ҵ���ӿڣ�ע����Ϣҵ���߼��ӿ�
 * @author liuqi
 * @date 2018.11.8 
 * @version 1.0
 */
import cn.com.iistudio.entity.UpImage;
import cn.com.iistudio.entity.UpUser;


public interface RegisterInter {
	public boolean doRegisterUpImage(UpImage upImage);
	public boolean doRegisterAccounct(UpUser upUser);

}
