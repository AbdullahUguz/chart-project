package Sort;

import Data.RecordFile;
import ReadFile.TxtFile.ParseTXT;
import ReadFile.XmlFile.ParseXML;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class SortedFile {

    List<RecordFile> sortList = new ArrayList<RecordFile>();
    List<String> category = new ArrayList<>();
    File file;
    ParseXML parseXML;
    ParseTXT parseTXT;
    String title;
    String lableName;

    public SortedFile() {

    }

    public List<String> getCategory() {

        if (file.getAbsolutePath().contains(".txt")) {
            setCategory(parseTXT.getCategory());
            return category;
        } else if (file.getAbsolutePath().contains(".xml")) {
            setCategory(parseXML.getCategory());
            return category;
        } else {
            throw new IllegalArgumentException("File's path is not available");
        }
    }

    public List<RecordFile> getSortList() throws FileNotFoundException {
        if (file.getAbsolutePath().contains(".txt")) {
            parseTXT = new ParseTXT(file);
            setSortList(parseTXT.getSortList());
            setTitle(parseTXT.getTitle());
            setLableName(parseTXT.getLableName());
            return sortList;
        } else if (file.getAbsolutePath().contains(".xml")) {
            parseXML = new ParseXML(file);
            setSortList(parseXML.getSortList());
            setTitle(parseXML.getTitle());
            setLableName(parseXML.getLableName());
            return sortList;
        } else {
            throw new IllegalArgumentException("File's path is not available");
        }
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }

    public void setSortList(List<RecordFile> sortList) {
        this.sortList = sortList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLableName() {
        return lableName;
    }

    public void setLableName(String lableName) {
        this.lableName = lableName;
    }

    public SortedFile(File file) {
        this.file = file;
    }

}
