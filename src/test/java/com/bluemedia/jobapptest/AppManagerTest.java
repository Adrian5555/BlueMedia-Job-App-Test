/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bluemedia.jobapptest;

import java.nio.CharBuffer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Ignore;

/**
 *
 * @author TEST
 */
public class AppManagerTest {
    
    public AppManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    public String spaces( int spaces ) {
        return CharBuffer.allocate( spaces ).toString().replace( '\0', ' ' );
    }
    /**
     * Test of createApp method, of class AppManager.
     */
    @Test
    @Ignore
    public void testCreateApp() {
        /*System.out.println("createApp");
        String Name = "TEST Name";
        String Content = "TEST Content";
        AppManager instance = new AppManager();
        instance.createApp(Name, Content);
        List<App> apps = instance.getAllApps();
        assertThat( apps ).isNotNull();
        Integer spacesToPrint = 32;
        System.out.println("Size: " + apps.size());
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        System.out.println("|               Name               |             Content              |         State          |");
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        for(App app : apps) {
            System.out.println("| " +app.getName() + spaces(spacesToPrint - app.getName().length() ) +
                    " | " + app.getContent() +  spaces(spacesToPrint - app.getContent().length() ) +
                    " | " + app.getCurrentState() +  spaces(spacesToPrint - 10 - app.getCurrentState().toString().length() ) +" |");
        }
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        
        instance.End();*/
    }

    /**
     * Test of rejectApp method, of class AppManager.
     */
    @Test
    public void testRejectApp() {
        System.out.println("rejectApp");
        String Id = "";
        String Reason = "";
        //AppManager instance = new AppManager();
        //instance.rejectApp(Id, Reason);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of acceptApp method, of class AppManager.
     */
    @Test
    public void testAcceptApp() {
        System.out.println("acceptApp");
        String Id = "";
        //AppManager instance = new AppManager();
        //instance.acceptApp(Id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of publishApp method, of class AppManager.
     */
    @Test
    public void testPublishApp() {
        System.out.println("publishApp");
        String Id = "";
        //AppManager instance = new AppManager();
        //instance.publishApp(Id);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
        /**
     * Test of End method, of class AppManager.
     */
    @Test
    public void testEnd() {
        System.out.println("End");
        //AppManager instance = new AppManager();
        //instance.End();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
     /**
     * Test of printHistory method, of class AppManager.
     */
    @Test
    @Ignore("Expected exception: https://forum.hibernate.org/viewtopic.php?f=31&t=1039494")
    public void testPrintHistoryById() {
        System.out.println("printHistory");
        String Id = "";
        /*AppManager instance = new AppManager();
        List<App> apps = instance.getAllApps();
        Integer spacesToPrint = 32;
        Random rand = new Random();
        Integer n = rand.nextInt(apps.size() - 1);
        //
        // Test Will always Fail:
        // https://forum.hibernate.org/viewtopic.php?f=31&t=1039494
        //        
        List<StateLog> logs = instance.printHistoryById(apps.get(n).getId());
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        System.out.println("|               Name               |             Date                 |         State          |");
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        for(StateLog log : logs) {
            System.out.println("| " +apps.get(n).getName() + spaces(spacesToPrint - apps.get(n).getName().length() ) +
                    " | " + log.getDate() +  spaces(spacesToPrint - log.getDate().toString().length() ) +
                    " | " + log.getAppState() +  spaces(spacesToPrint - 10 - log.getAppState().toString().length() ) +" |");
        }
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        instance.End();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype."); */
    }
    
     /**
     * Test of printHistory method, of class AppManager.
     */
    @Test
    @Ignore
    public void testPrintRandomHistory() {
        System.out.println("PrintRandomHistory");
        String Id = "";
        /* AppManager instance = new AppManager();
        List<App> apps = instance.getAllApps();
        Integer spacesToPrint = 32;
        Random rand = new Random();
        Integer n = rand.nextInt(apps.size() - 1);
        Set<StateLog> logs = apps.get(n).getHistory();
        assertThat( logs ).isNotNull();
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        System.out.println("|               Name               |             Date                 |         State          |");
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        for(StateLog log : logs) {
            System.out.println("| " +apps.get(n).getName() + spaces(spacesToPrint - apps.get(n).getName().length() ) +
                    " | " + log.getDate() +  spaces(spacesToPrint - log.getDate().toString().length() ) +
                    " | " + log.getAppState() +  spaces(spacesToPrint - 10 - log.getAppState().toString().length() ) +" |");
        }
        System.out.println("+----------------------------------+----------------------------------+------------------------+");
        instance.End();*/
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
