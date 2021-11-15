package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object SQLServer
     
    /**
     * <p></p>
     */
    public static Object SQLPort
     
    /**
     * <p></p>
     */
    public static Object SQLUserName
     
    /**
     * <p></p>
     */
    public static Object SQLPassword
     
    /**
     * <p></p>
     */
    public static Object SQLDatabase
     
    /**
     * <p></p>
     */
    public static Object url1
     
    /**
     * <p></p>
     */
    public static Object url2
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            SQLServer = selectedVariables['SQLServer']
            SQLPort = selectedVariables['SQLPort']
            SQLUserName = selectedVariables['SQLUserName']
            SQLPassword = selectedVariables['SQLPassword']
            SQLDatabase = selectedVariables['SQLDatabase']
            url1 = selectedVariables['url1']
            url2 = selectedVariables['url2']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
