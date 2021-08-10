package core.model;

public interface Matcher {

    // refers to type of difference : newLine - missingLine - editedLine - noChanges
    int match(String r1, String r2);
}
