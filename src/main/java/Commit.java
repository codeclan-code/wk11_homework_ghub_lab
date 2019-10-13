public class Commit {

    private int commituniqueid;
    private CommitType committype;
    private String description;

    public Commit(int commituniqueid, CommitType committype,String description){
        this.commituniqueid = commituniqueid;
        this.committype = committype;
        this.description = description;
    }

    public int getCommitUniqueID() {
        return this.commituniqueid;

    }
    public CommitType getCommitType() {
        return this.committype;
    }

    public String getCommitDescription(){
        return this.description;
    }


}
