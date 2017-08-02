
public class Main {
    public static String getGitRepoStructure(String externalUrl) {
        GitUrlParser.GitUrlData urlData = GitUrlParser.parseToObject(externalUrl);
        if (urlData != null) {
            String organization = urlData.getOrganization();
            String repository = urlData.getRepository();
            if (organization != null && !organization.isEmpty()) {
                return organization + "/" + repository;
            } else {
                return repository;
            }
        } else {
            String[] a = externalUrl.split("/");
            if (a.length != 0) {
                return a[a.length - 1];
            } else {
                return null;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(getGitRepoStructure("http://github.com/hawkular/hawkular-services"));
        System.out.println(getGitRepoStructure("http://my.host.com/public-repos/user/project.git"));
        System.out.println(getGitRepoStructure("http://my.host.com/project.git"));
        System.out.println(getGitRepoStructure("git+ssh://github.com/a-random-user/repo"));
    }
}
