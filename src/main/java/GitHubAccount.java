import java.util.ArrayList;

public class GitHubAccount {

    private String username;
    private String name;
    private GitHubAccountType githubaccounttype;
    private ArrayList<Repository> repositories;

    public GitHubAccount(String username, String name, GitHubAccountType githubaccounttype){
        this.username = username;
        this.name = name;
        this.githubaccounttype = githubaccounttype;
        this.repositories = new ArrayList<Repository>();
    }

    public String getUserName() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public GitHubAccountType getGitHubAccountType() {
        return githubaccounttype;
    }

    public void addRepository(Repository repository){
        this.repositories.add(repository);
    }

    public int getRepositoryCount() {
        return this.repositories.size();
    }

    public GitHubAccountType getUpgradedAccountType() {
        return this.githubaccounttype.PRO;
    }

    public GitHubAccountType getDownGradedAccountType() {
        return this.githubaccounttype.FREE;
    }
}
