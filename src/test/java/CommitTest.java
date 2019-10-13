import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    private Commit commit1;
    private Commit commit2;

    @Before
    public void before(){

        commit1 = new Commit(1, CommitType.FEATURE, "initial commit");
        commit2 = new Commit(2, CommitType.FEATURE, "initial commit");
    }

    @Test
    public void canGetCommitUniqueID(){
        assertEquals(1, commit1.getCommitUniqueID());
    }

    @Test
    public void canGetCommitType(){
        assertEquals(CommitType.FEATURE, commit1.getCommitType());
    }

    @Test
    public void canGetCommitDescription(){
        assertEquals("initial commit", commit1.getCommitDescription());
    }


}
