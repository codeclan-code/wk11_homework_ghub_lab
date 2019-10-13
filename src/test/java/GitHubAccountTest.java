import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount githubaccount1;

    @Before
    public void before(){

        githubaccount1 = new GitHubAccount("tosuch", "Ted", GitHubAccountType.FREE);
    }

    @Test
    public void canGetUserName(){
        assertEquals("tosuch", githubaccount1.getUserName());
    }

    @Test
    public void canGetName(){
        assertEquals("Ted", githubaccount1.getName());
    }

    @Test
    public void canGetAccountType(){
        assertEquals(GitHubAccountType.FREE, githubaccount1.getGitHubAccountType());
    }


}
