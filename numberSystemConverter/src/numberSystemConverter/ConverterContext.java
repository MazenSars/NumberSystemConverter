package numberSystemConverter;

import java.io.File;
import java.io.FilenameFilter;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;

public class ConverterContext {
	
	HashMap<String, NumberSystem> map= new HashMap<String, NumberSystem>();
	private ClassLoader loader;
	
	public ConverterContext() {
		registerSystem();
	}
	public void registerSystem() {
		File folder= new File("bin/plugins");
		//System.out.println(folder);
		FilenameFilter filter= (dir, name)-> name.endsWith(".class");
		for (File file: folder.listFiles(filter)) {
			String className= file.getName().strip().substring(0, file.getName().length()-6);
			String loadPath= "plugins."+className;
			//System.out.println(loadPath);
			try {
				loader = new URLClassLoader(new URL[] {folder.toURI().toURL()}, getClass().getClassLoader());
				Class<?> clas= loader.loadClass(loadPath);
				NumberSystem instance= (NumberSystem) clas.getDeclaredConstructor().newInstance();
				map.put(instance.getName(), instance);
			} catch (MalformedURLException | ClassNotFoundException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
				e.printStackTrace();
			}
			
		}
	}
}
