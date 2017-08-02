
public class Main {

    public static void main(String[] args) {
        System.out.println(GitUrlParser.generateInternalRepositoryName("http://github.com/hawkular/hawkular-services"));
        System.out.println(GitUrlParser.generateInternalRepositoryName("http://my.host.com/public-repos/user/project.git"));
        System.out.println(GitUrlParser.generateInternalRepositoryName("http://my.host.com/project.git"));
        System.out.println(GitUrlParser.generateInternalRepositoryName("git+ssh://github.com/a-random-user/repo"));
    }
}
