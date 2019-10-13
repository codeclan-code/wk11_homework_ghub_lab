public class GitHubAccount {

    private String username;
    private String name;
    private GitHubAccountType githubaccounttype;

    public GitHubAccount(String username, String name, GitHubAccountType githubaccounttype){
        this.username = username;
        this.name = name;
        this.githubaccounttype = githubaccounttype;
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
}
