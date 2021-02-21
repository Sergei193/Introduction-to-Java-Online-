package Task_1;

import java.util.ArrayList;

public class Directory {
    private String directoryName;
    protected ArrayList<File> listFilesDirectory;

    protected Directory(String directoryName) {
        this.directoryName = directoryName;
        listFilesDirectory = new ArrayList<>();
    }

    protected void addFileDirectory(File file) {
        listFilesDirectory.add(file);
        System.out.println("File " + file.getNameFile() + " added successfully!!!");
    }

    protected void printContentFile(String nameFile) {

        for (File file : listFilesDirectory) {
            if (nameFile.equals(file.getNameFile())) {
                System.out.println("Content of file\n" + file.stringBufferContentFile.toString());
            }
        }

    }

    protected void addToFile(String nameFile, String information) {

        if (!listFilesDirectory.isEmpty()) {
            for (File file : listFilesDirectory) {
                if (nameFile.equals(file.getNameFile())) {
                    file.saveTextFile(file.addText(information));
                }
            }
        }
    }

    public void removeFileDirectory(String nameFile) {
        if (listFilesDirectory.isEmpty()) {
            System.out.println("List files in this directory is empty!!!");
        } else if (!listFilesDirectory.isEmpty()) {
            for (File file : listFilesDirectory) {
                if (nameFile.equalsIgnoreCase(file.getNameFile())) {
                    listFilesDirectory.remove(file);
                    System.out.println("File " + nameFile + " removed successfully");
                }
            }
        }
    }

    public void changeSetDirectoryName(String directoryName) {
        System.out.println("Old directory name " + getDirectoryName());
        setDirectoryName(directoryName);
        System.out.println("New directory name " + getDirectoryName());
    }

    public String getDirectoryName() {

        return directoryName;
    }

    public void setDirectoryName(String directoryName) {

        this.directoryName = directoryName;
    }
}
