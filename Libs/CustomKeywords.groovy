
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject

import com.applitools.eyes.selenium.Eyes

import org.openqa.selenium.WebElement

import com.applitools.eyes.RectangleSize



def static "com.database.sqlserver.connectDB"() {
    (new com.database.sqlserver()).connectDB()
}


def static "com.database.sqlserver.executeQuery"(
    	String queryString	) {
    (new com.database.sqlserver()).executeQuery(
        	queryString)
}


def static "com.database.sqlserver.CloseDBConnection"() {
    (new com.database.sqlserver()).CloseDBConnection()
}


def static "com.database.sqlserver.execute"(
    	String queryString	) {
    (new com.database.sqlserver()).execute(
        	queryString)
}


def static "com.database.database.connectMysqlDB"() {
    (new com.database.database()).connectMysqlDB()
}


def static "com.database.database.connectSQLDB"() {
    (new com.database.database()).connectSQLDB()
}


def static "com.database.database.executeQuery"(
    	String queryString	) {
    (new com.database.database()).executeQuery(
        	queryString)
}


def static "com.database.database.closeDatabaseConnection"() {
    (new com.database.database()).closeDatabaseConnection()
}


def static "com.database.database.execute"(
    	String queryString	) {
    (new com.database.database()).execute(
        	queryString)
}


def static "com.database.mysql.connectDB"() {
    (new com.database.mysql()).connectDB()
}


def static "com.database.mysql.executeQuery"(
    	String queryString	) {
    (new com.database.mysql()).executeQuery(
        	queryString)
}


def static "com.database.mysql.closeDatabaseConnection"() {
    (new com.database.mysql()).closeDatabaseConnection()
}


def static "com.database.mysql.execute"(
    	String queryString	) {
    (new com.database.mysql()).execute(
        	queryString)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow"(
    	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkWindow(
        	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkTestObject"(
    	TestObject testObject	
     , 	String testName	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkTestObject(
        	testObject
         , 	testName)
}


def static "com.kms.katalon.keyword.applitools.BasicKeywords.checkElement"(
    	Eyes eyes	
     , 	WebElement element	) {
    (new com.kms.katalon.keyword.applitools.BasicKeywords()).checkElement(
        	eyes
         , 	element)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesClose"(
    	Eyes eyes	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesClose(
        	eyes)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpenWithBaseline"(
    	String baselineName	
     , 	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpenWithBaseline(
        	baselineName
         , 	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesOpen"(
    	String testName	
     , 	RectangleSize viewportSize	) {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesOpen(
        	testName
         , 	viewportSize)
}


def static "com.kms.katalon.keyword.applitools.EyesKeywords.eyesInit"() {
    (new com.kms.katalon.keyword.applitools.EyesKeywords()).eyesInit()
}
