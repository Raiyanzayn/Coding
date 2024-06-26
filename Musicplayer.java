package demo;

public class Musicplayer {

	
//  package demo ;
//	import java.io.*;
//	import java.util.*;
//
//	class Node {
//	    String song;
//	    Node next;
//	    Node prev;
//
//	    Node(String song) {
//	        this.song = song;
//	        this.next = null;
//	        this.prev = null;
//	    }
//	}
//
//	 class PlaylistManager {
//	    static Node top, temp, top1;
//
//	    static void toFile(String song) {
//	        try {
//	            BufferedWriter writer = new BufferedWriter(new FileWriter("playlist.txt", true));
//	            writer.write(song);
//	            writer.newLine();
//	            writer.close();
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//
//	    static void addNode(Node first) {
//	        String song;
//	        while (first.next != null) {
//	            first = first.next;
//	        }
//	        first.next = new Node(null);
//	        first.prev = first;
//	        first = first.next;
//	        System.out.print("\nEnter Song name: ");
//	        Scanner scanner = new Scanner(System.in);
//	        song = scanner.nextLine();
//	        first.song = song;
//	        toFile(song);
//	        first.next = null;
//	    }
//
//	    static void addNodeFromFile(Node first, String song) {
//	        while (first.next != null) {
//	            first = first.next;
//	        }
//	        first.next = new Node(null);
//	        first.prev = first;
//	        first = first.next;
//	        first.song = song;
//	        first.next = null;
//	    }
//
//	    static void deleteFile(String song) {
//	        try {
//	            File inputFile = new File("playlist.txt");
//	            File tempFile = new File("temp.txt");
//
//	            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
//	            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));
//
//	            String currentLine;
//	            int x = 0;
//
//	            while ((currentLine = reader.readLine()) != null) {
//	                if (!song.equals(currentLine)) {
//	                    writer.write(currentLine + System.getProperty("line.separator"));
//	                } else {
//	                    x = 1;
//	                }
//	            }
//
//	            reader.close();
//	            writer.close();
//	            inputFile.delete();
//	            tempFile.renameTo(inputFile);
//
//	            if (x == 0) {
//	                System.out.println("There is no song with the name you entered.");
//	            } else {
//	                System.out.println("Song has been deleted.");
//	            }
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//
//	    static void deleteNode(Node first) {
//	        while (first.next.next != null) {
//	            first = first.next;
//	        }
//	        Node tempNode = first.next.next;
//	        first.next = null;
//	        tempNode = null;
//	        System.out.println("Deleted");
//	    }
//
//	    static void printList(Node first) {
//	        System.out.print("\nPlaylist Name- ");
//	        while (first.next != null) {
//	            System.out.println(first.song);
//	            first = first.next;
//	        }
//	        System.out.println(first.song);
//	    }
//
//	    static void countNodes(Node first) {
//	        int i = 0;
//	        while (first.next != null) {
//	            first = first.next;
//	            i++;
//	        }
//	        i++;
//	        System.out.println("\nTotal songs: " + (i - 1));
//	    }
//
//	    static Node deletePosition(Node pointer, int pos) {
//	        Node n1, prev1, temp;
//	        prev1 = new Node(null);
//	        temp = new Node(null);
//	        int i = 0;
//
//	        if (pos == 1) {
//	            temp = pointer;
//	            deleteFile(temp.song);
//	            pointer = pointer.next;
//	            pointer.prev = null;
//	            temp = null;
//	            System.out.println("\nThe list is updated.\nUse the display function to check.");
//	            return pointer;
//	        }
//
//	        while (i < pos - 1) {
//	            prev1 = pointer;
//	            pointer = pointer.next;
//	            i++;
//	        }
//
//	        if (pointer.next == null) {
//	            temp = pointer;
//	            deleteFile(temp.song);
//	            prev1.next.prev = null;
//	            prev1.next = null;
//	            temp = null;
//	            System.out.println("\nThe list is updated.\nUse the display function to check.");
//	        } else {
//	            temp = pointer;
//	            deleteFile(temp.song);
//	            prev1.next = temp.next;
//	            temp.next.prev = prev1;
//	            temp = null;
//	            System.out.println("\nThe list is updated.\nUse the display function to check.");
//	        }
//
//	        return pointer;
//	    }
//
//	    static void search(Node first) {
//	        String song;
//	        System.out.print("\nEnter song to be searched: ");
//	        Scanner scanner = new Scanner(System.in);
//	        song = scanner.nextLine();
//	        int flag = 0;
//
//	        while (first != null) {
//	            if (first.song.equals(song)) {
//	                System.out.println("\n#Song Found");
//	                flag++;
//	                break;
//	            } else {
//	                first = first.next;
//	            }
//	        }
//	        if (flag == 0) {
//	            System.out.println(); //(Song Not found);
//	        }
//	    }
//
//	    static void create() {
//	        top = null;
//	    }
//
//	    static void push(String data) {
//	        if (top == null) {
//	            top = new Node(data);
//	        } else if (!top.song.equals(data)) {
//	            temp = new Node(data);
//	            temp.next = top;
//	            top = temp;
//	        }
//	    }
//
//	    static void display() {
//	        top1 = top;
//	        if (top1 == null) {
//	            System.out.println("\n=>NO recently played tracks.");
//	            return;
//	        }
//	        System.out.println("\n=>Recently played tracks-");
//	        while (top1 != null) {
//	            System.out.println(top1.song);
//	            top1 = top1.next;
//	        }
//	    }
//
//	    static void play(Node first) {
//	        String song;
//	        printList(first);
//	        System.out.print("\nChoose song you wish to play: ");
//	        Scanner scanner = new Scanner(System.in);
//	        song = scanner.nextLine();
//	        int flag = 0;
//
//	        while (first != null) {
//	            if (first.song.equals(song)) {
//	                System.out.println("\n=>Now Playing......" + song);
//	                flag++;
//	                push(song);
//	                break;
//	            } else {
//	                first = first.next;
//	            }
//	        }
//	        if (flag == 0) {
//	            System.out.println("\n#Song Not found");
//	        }
//	    }
//
//	    static void recent() {
//	        display();
//	    }
//
//	    static void topElement() {
//	        top1 = top;
//	        if (top1 == null) {
//	            System.out.println("\n#NO last played tracks.");
//	            return;
//	        }
//	        System.out.println("\n=>Last Played Song - " + top.song);
//	    }
//	    static void sort(Node pointer) {
//	        Node a = null;
//	        Node b = null;
//	        Node c = null;
//	        Node e = null;
//	        Node tmp = null;
//
//	        while (e != pointer.next) {
//	            c = a = pointer;
//	            b = a.next;
//	            while (a != e) {
//	                if (a.song.compareTo(b.song) > 0) {
//	                    if (a == pointer) {
//	                        tmp = b.next;
//	                        b.next = a;
//	                        a.next = tmp;
//	                        pointer = b;
//	                        c = b;
//	                    } else {
//	                        tmp = b.next;
//	                        b.next = a;
//	                        a.next = tmp;
//	                        c.next = b;
//	                        c = b;
//	                    }
//	                } else {
//	                    c = a;
//	                    a =b ;
//
//}
//}
//	        }
//	    
	
	
	
	
}
