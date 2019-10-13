import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository1;
    private Repository repository2;
    private Commit commit1;
    private Commit commit2;

    @Before
    public void before(){

        repository1 = new Repository("javarepo1", "Repo1 Description", RepositoryType.PUBLIC);
        repository2 = new Repository("javarepo2", "Repo2 Description", RepositoryType.PRIVATE);
        commit1 = new Commit(1, CommitType.REFACTOR, "initial commit");
        commit2 = new Commit(2, CommitType.REFACTOR, "initial commit");
    }

    @Test
    public void canGetRepositoryName(){
        assertEquals("javarepo1", repository1.getRepositoryName());
    }

    @Test
    public void canGetRepositoryDescripion(){
        assertEquals("Repo1 Description", repository1.getRepositoryDescription());
    }

    @Test
    public void canGetRepositoryType(){
        assertEquals(RepositoryType.PUBLIC, repository1.getRepositoryType());
    }

    @Test
    public void canAddCommit(){
        repository1.addCommit(commit1);
        repository1.addCommit(commit2);
        assertEquals(2,repository1.getCommitCount());
    }

    @Test
    public void canGetRepositoryByName(){
        assertEquals("javarepo2", repository2.getRepositoryName());
    }
}
