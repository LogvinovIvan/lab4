/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LoadingClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Properties;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import javaapplication23.PluginLoadException;
import javax.swing.JButton;

/**
 *
 * @author Иван
 */
public class PluginsInfo {
        private Plugin instance;

	private String buttonText;

	private JButton associatedButton;

	public PluginsInfo(File jarFile) throws PluginLoadException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		try {
			Properties props = getPluginProps(jarFile);
			if (props == null)
				throw new IllegalArgumentException("No props file found");
                        
			String pluginClassName = props.getProperty("main");;
			if (pluginClassName == null || pluginClassName.length() == 0) {
				throw new PluginLoadException("Missing property main.class");
			}

			buttonText = props.getProperty("button.text");
			if (buttonText == null || buttonText.length() == 0) {
				throw new PluginLoadException("Missing property button.text");
			}

			URL jarURL = jarFile.toURI().toURL();
			URL[] urls = new URL[]{jarURL};
                        URLClassLoader classLoader = URLClassLoader.newInstance(urls);
			Class pluginClass = classLoader.loadClass(pluginClassName);
			instance = (Plugin) pluginClass.newInstance();
		} catch (PluginLoadException e) {
			throw new PluginLoadException(e);
		}
	}

	public Plugin getPluginInstance() {
		return instance;
	}

	public String getButtonText() {
		return buttonText;
	}

	private Properties getPluginProps(File file) throws IOException {
		Properties result = null;
		JarFile jar = new JarFile(file);
		
                Enumeration entries = jar.entries();
         
		while (entries.hasMoreElements()) {
			JarEntry entry = (JarEntry) entries.nextElement();
			 
                        if (entry.getName().equals("Properties")) {
				// That's it! Load props
				InputStream is = null;
				try {
					is = jar.getInputStream(entry);
					result = new Properties();
					result.load(is);
				} finally {
					if (is != null)
						is.close();
				}
			}
		}
		return result;
	}

	
        
        
        public void setAssociatedButton(JButton associatedButton) {
		this.associatedButton = associatedButton;
	}

	public JButton getAssociatedButton() {
		return associatedButton;
	}
}
