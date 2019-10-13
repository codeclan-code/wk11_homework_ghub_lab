import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount githubaccount1;

    @Before
    public void before(){

        githubaccount1 = new GitHubAccount();
    }

    @Test
    public void canGetUserName(){
        assertEquals("tosuch", githubaccount1.getUserName());
    }

}
