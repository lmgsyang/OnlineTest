package cn.edu.yuntukeji.hibernate;



import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static String CONFIG_FILE_LOCATION = "/hibernate.cfg.xml";// 配置文件
	private static final ThreadLocal<Session> threadLocal = new ThreadLocal<Session>();// 定义ThreadLocal对象
	private static Configuration configuration = new Configuration();// 定义Configuration对象
	private static org.hibernate.SessionFactory sessionFactory;
	private static String configFile = CONFIG_FILE_LOCATION;
	static {
		try {
			configuration.configure(configFile);// 读取文件
			sessionFactory = configuration.buildSessionFactory();// 创建SessionFactory对象
		} catch (Exception e) {
			System.err.println("%%%Error Creating SessionFactory%%%");
			e.printStackTrace();
		}

	}
	private HibernateSessionFactory() {
	}
	public static Session getSession() throws HibernateException {
		Session session = (Session) threadLocal.get();// 获得Session对象
		if (sessionFactory == null || !session.isOpen()) {// 判断Session是否为空或者未打开
			if (sessionFactory == null) {// 如果没有创建SessionFactory对象
				rebuildSessionFactory();
			}
			//如果SessionFactory对象不为空，则调用其openSession方法创建
			session = (sessionFactory != null) ? sessionFactory.openSession()
					: null;
			threadLocal.set(session);//在ThreadLocal对象中保存该Session对象
		}
		return session;

	}
	private static  void rebuildSessionFactory() {
		try {
			configuration.configure(configFile);//读取配置文件
			sessionFactory = configuration.buildSessionFactory();//创建sessionFactory对象
			
		} catch (Exception e) {
			System.err.println("%%%Error Creating SessionFactory%%%");
			e.printStackTrace();
		}
		
		
	}
	private static void closeSession() throws HibernateException {
		Session session = (Session) threadLocal.get();
		threadLocal.set(null);
		if (session != null) {
			session.close();
		}
	}

	public static org.hibernate.SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	public static void setConfigFile(String configFile) {
		HibernateSessionFactory.configFile = configFile;
		sessionFactory = null;
	}
	public static Configuration getConfiguration() {
		return configuration;
	}
}
