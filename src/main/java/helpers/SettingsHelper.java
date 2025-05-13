package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SettingsHelper {

    private static final Properties properties = new Properties();

    static {
        try (InputStream input = new FileInputStream("src/main/resources/settings.properties")) {
            properties.load(input);
        } catch (IOException ex) {
            throw new RuntimeException("Failed to load the settings file.", ex);
        }
    }

    public static String getString(String key) {
        return properties.getProperty(key, "");
    }

    public static long getLong(String key) {
        String value = getString(key);
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}