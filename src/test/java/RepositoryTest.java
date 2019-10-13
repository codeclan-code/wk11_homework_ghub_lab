import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    private Repository repository1;

    @Before
    public void before(){

        repository1 = new Repository("javarepo1", "Repo1 Description", RepositoryType.PUBLIC);
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
}
