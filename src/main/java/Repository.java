public class Repository {

    private String repositoryname;
    private String repositorydescription;

    public Repository(String repositoryname, String repositorydescription){
        this.repositoryname = repositoryname;
        this.repositorydescription = repositorydescription;
    }

    public String getRepositoryName(){
        return this.repositoryname;
    }

    public String getRepositoryDescription() {
        return this.repositorydescription;
    }
}
