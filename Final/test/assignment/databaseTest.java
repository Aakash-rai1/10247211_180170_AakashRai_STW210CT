/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aakas
 */
public class databaseTest {
    
    public databaseTest() {
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

    /**
     * Test of questionData method, of class database.
     */
    @Test
    public void testQuestionData() {
        System.out.println("questionData");
        Iterable<questiongetter> expResult = null;
        Iterable<questiongetter> result = database.questionData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of saveanswer method, of class database.
     */
    @Test
    public void testSaveanswer() {
        System.out.println("saveanswer");
        int scode = 0;
        String subject = "";
        String question = "";
        String answer1 = "";
        String answer2 = "";
        String answer3 = "";
        String answer4 = "";
        String correct = "";
        database instance = new database();
        int expResult = 0;
        int result = instance.saveanswer(scode, subject, question, answer1, answer2, answer3, answer4, correct);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of updateanswer method, of class database.
     */
    @Test
    public void testUpdateanswer() {
        System.out.println("updateanswer");
        int id = 0;
        int scode = 0;
        String subject = "";
        String question = "";
        String answer1 = "";
        String answer2 = "";
        String answer3 = "";
        String answer4 = "";
        String correct = "";
        database instance = new database();
        int expResult = 0;
        int result = instance.updateanswer(id, scode, subject, question, answer1, answer2, answer3, answer4, correct);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of deletequestion method, of class database.
     */
    @Test
    public void testDeletequestion() {
        System.out.println("deletequestion");
        int id = 0;
        database instance = new database();
        int expResult = 0;
        int result = instance.deletequestion(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class database.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        String name = "";
        String password = "";
        database instance = new database();
        boolean expResult = false;
        boolean result = instance.login(name, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of admin method, of class database.
     */
    @Test
    public void testAdmin() {
        System.out.println("admin");
        String username = "";
        String password = "";
        database instance = new database();
        boolean expResult = false;
        boolean result = instance.admin(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of save method, of class database.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        String name = "";
        String email = "";
        String password = "";
        database instance = new database();
        int expResult = 0;
        int result = instance.save(name, email, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteuser method, of class database.
     */
    @Test
    public void testDeleteuser() {
        System.out.println("deleteuser");
        int id = 0;
        database instance = new database();
        int expResult = 0;
        int result = instance.deleteuser(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getAlphaNumericString method, of class database.
     */
    @Test
    public void testGetAlphaNumericString() {
        System.out.println("getAlphaNumericString");
        int n = 0;
        database instance = new database();
        String expResult = "";
        String result = instance.getAlphaNumericString(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of modulequestion method, of class database.
     */
    @Test
    public void testModulequestion() {
        System.out.println("modulequestion");
        String modelname = "";
        database instance = new database();
        List<modules> expResult = null;
        List<modules> result = instance.modulequestion(modelname);
        assertEquals(null, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getUserDetail method, of class database.
     */
    @Test
    public void testGetUserDetail() {
        System.out.println("getUserDetail");
        database instance = new database();
        List<users> expResult = null;
        List<users> result = instance.getUserDetail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of questiondata method, of class database.
     */
    @Test
    public void testQuestiondata() {
        System.out.println("questiondata");
        database instance = new database();
        List<questiongetter> expResult = null;
        List<questiongetter> result = instance.questiondata();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
