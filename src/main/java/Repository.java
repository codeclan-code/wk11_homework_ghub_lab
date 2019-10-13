import java.util.ArrayList;

public class Repository {

    private String repositoryname;
    private String repositorydescription;
    private RepositoryType repositorytype;
    private ArrayList<Commit> commits;

    public Repository(String repositoryname, String repositorydescription, RepositoryType repositorytype){
        this.repositoryname = repositoryname;
        this.repositorydescription = repositorydescription;
        this.repositorytype = repositorytype;
        this.commits = new ArrayList<Commit>();
    }

    public String getRepositoryName(){
        return this.repositoryname;
    }

    public String getRepositoryDescription() {
        return this.repositorydescription;
    }

    public RepositoryType getRepositoryType() {
        return this.repositorytype;
    }

    public void addCommit(Commit commit){
        this.commits.add(commit);
    }

    public int getCommitCount() {
        return this.commits.size();
    }


}
