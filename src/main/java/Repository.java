public class Repository {

    private String repositoryname;
    private String repositorydescription;
    private RepositoryType repositorytype;

    public Repository(String repositoryname, String repositorydescription, RepositoryType repositorytype){
        this.repositoryname = repositoryname;
        this.repositorydescription = repositorydescription;
        this.repositorytype = repositorytype;
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
}
