
package model.util;

import org.apache.log4j.Logger;


public class Log {
    public static void gravaLogException(Class pClase, Exception ex)
    {
        Logger wLog = Logger.getLogger(pClase);
        wLog.error(ex);
    }
}
