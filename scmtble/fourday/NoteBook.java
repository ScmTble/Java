package scmtble.fourday;

import java.util.ArrayList;

public class NoteBook {

    private ArrayList<String> notes = new ArrayList<String>();

    public void add(String s) {
        notes.add(s);
    }

    public void add(String s,int location){
        notes.add(location,s);
    }

    public int GetSize() {
        return notes.size();
    }

    public String getNote(int index) {
        return notes.get(index);
    }

    public void removeNote(int index) {
        notes.remove(index);
    }

    public String[] listNote() {
        String[] a = new String[notes.size()];
//        for (int i = 0; i < notes.size(); i++) {
//            a[i] = notes.get(i);
//        }
        notes.toArray(a);
        return a;
    }

    public static void main(String[] args) {
        NoteBook note1 = new NoteBook();
        note1.add("Hello");
        note1.add("ScmTble",0);
        System.out.println(note1.getNote(0));
    }
}
