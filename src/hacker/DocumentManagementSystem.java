package hacker;


import java.io.*;
import java.util.*;

public class DocumentManagementSystem
{
	 public static class Heading {
	        protected int weight;
	        protected String text;

	        public Heading(int weight, String text) {
	            this.weight = weight;
	            this.text = text;
	        }

			@Override
			public String toString() {
				return "Heading [weight=" + weight + ", text=" + text + "]";
			}
	        
	    }
	    public static class Node {
	        protected Heading heading;
	        protected List<Node> children;

	        public Node(Heading heading) {
	            this.heading = heading;
	            this.children = new ArrayList<>();
	        }
	    }

	    public static void main(String[] args) throws java.lang.Exception
	    {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        List<Heading> headings = new ArrayList<>();
	        
	        headings.add(new Heading(1,"America"));
	        headings.add(new Heading(2,"North America"));
	        System.out.println("--size---"+headings.size());
	        Node outline = toOutline(headings);
	        
	        String html = toHtml(outline);
	        System.out.println(html);
	    }

	    /////////// BEGIN EDITABLE //////////////
	    private static Node toOutline(List<Heading> headings) {
	        // Implement this function. Sample code below builds an
	        // outline of only the first heading.
	    	 Node root=null;
	          headings.forEach(s->System.out.println("-Weight--"+s.weight+ "  Text--"+s.text));


	            if(headings.size()==1){
	                 root = new Node(new Heading(0, ""));
	                 root.children.add(new Node(headings.get(0)));
	            }
	            else{
	                     root = new Node(new Heading(0, ""));
	                     root.children.add(new Node(headings.get(0)));
	                     root = new Node(new Heading(0, ""));
	                     root.children.add(new Node(headings.get(1)));
	            }
	           
	            return root;
	    }
	    /////////// END EDITABLE //////////////



	    /** Parses a line of input.
	     This implementation is correct for all predefined test cases. */
	    private static Heading parse(String record) {
	        String[] parts = record.split(" ", 2);
	        int weight = Integer.parseInt(parts[0].substring(1));
	        Heading heading = new Heading(weight, parts[1].trim());
	        return heading;
	    }

	    /** Converts a node to HTML.
	     This implementation is correct for all predefined test cases. */
	    private static String toHtml(Node node) {
	        StringBuilder buf = new StringBuilder();
	        if (!node.heading.text.isEmpty()) {
	            buf.append(node.heading.text);
	            buf.append("\n");
	        }
	        Iterator<Node> iter = node.children.iterator();
	        if (iter.hasNext()) {
	            buf.append("<ul>");

	            while (iter.hasNext()) {
	                Node child = iter.next();
	                buf.append("<li>");
	                buf.append(toHtml(child));
	                buf.append("</li>");
	                if (iter.hasNext()) {
	                    buf.append("\n");
	                }
	            }
	            buf.append("</ul>");
	        }
	        return buf.toString();
	    }
}