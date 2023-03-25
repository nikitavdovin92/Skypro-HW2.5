public class RegexChecker implements Checker {

    @Override
    public boolean isValid (String s) {
        return s.matches("^\\w+$");
    }
}
