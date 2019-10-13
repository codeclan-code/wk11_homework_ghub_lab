import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    private GitHubAccount githubaccount1;
    private GitHubAccount githubaccount2;
    private Repository repository1;
    private Repository repository2;

    @Before
    public void before(){

        githubaccount1 = new GitHubAccount("tosuch", "Ted", GitHubAccountType.FREE);
        githubaccount2 = new GitHubAccount("rosuch", "Red", GitHubAccountType.PRO);
        repository1 = new Repository("javarepo1", "Repo1 Description", RepositoryType.PUBLIC);
        repository2 = new Repository("javarepo2", "Repo2 Description", RepositoryType.PRIVATE);
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

    @Test
    public void canAddRepository(){
        githubaccount1.addRepository(repository1);
        githubaccount1.addRepository(repository2);
        assertEquals(2,githubaccount1.getRepositoryCount());
    }

    @Test
    public void canUpgradeAccountType(){
        githubaccount1 = new GitHubAccount("tosuch", "Ted", GitHubAccountType.FREE);
        assertEquals(GitHubAccountType.PRO, githubaccount1.getUpgradedAccountType());
    }

    @Test
    public void canDownGradeAccountType(){
        githubaccount2 = new GitHubAccount("rosuch", "Red", GitHubAccountType.PRO);
        assertEquals(GitHubAccountType.FREE, githubaccount2.getDownGradedAccountType());
    }


}
