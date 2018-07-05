import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * I originally asked this question: Regular Expression in gVim to Remove Duplicate Domains from a List
 * However, I realize I may be more likely to find a working solution if I "broaden my scope" in terms of what
 * solution I'm willing to accept.
 *
 * So, I'll rephrase my question & maybe I'll get a better solution...here goes:
 * I have a large list of URLs in a .txt file (I'm running Windows Vista 32bit)
 * and I need to remove duplicate DOMAINS (and the entire corresponding URL to each duplicate) while leaving
 * behind the first occurrence of each domain. There are roughly 6,000,000 URLs in this particular file, in
 * the following format (the URLs obviously don't have a space in them, I just had to do that because I don't
 * have enough posts here to post that many "live" URLs):
 *
 * http://www.exampleurl.com/something.php
 * http://exampleurl.com/somethingelse.htm
 * http://exampleurl2.com/another-url
 * http://www.exampleurl2.com/a-url.htm
 * http://exampleurl2.com/yet-another-url.html
 * http://exampleurl.com/
 * http://www.exampleurl3.com/here_is_a_url
 * http://www.exampleurl5.com/something
 *
 * Whatever the solution is, the output file using the above as the input, should be this:
 * http://www.exampleurl.com/something.php
 * http://exampleurl2.com/another-url
 * http://www.exampleurl3.com/here_is_a_url
 * http://www.exampleurl5.com/something
 */
public class DuplicateUrlRemoval {
    private static int LENGTH_OG_HTTPS = 7;

    public static void main(String args[]) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("http://www.exampleurl.com/something.php");
        arrayList.add("http://exampleurl.com/somethingelse.htm");
        arrayList.add("http://exampleurl2.com/another-url");
        arrayList.add("http://www.exampleurl2.com/a-url.htm");
        arrayList.add("http://exampleurl2.com/yet-another-url.html");
        arrayList.add("http://exampleurl.com/");
        arrayList.add("http://www.exampleurl3.com/here_is_a_url");
        arrayList.add("http://www.exampleurl5.com/something");
        DuplicateUrlRemoval duplicateUrlRemoval = new DuplicateUrlRemoval();
        System.out.println(duplicateUrlRemoval.removeDuplicateUrl(arrayList));
    }

    private ArrayList<String> removeDuplicateUrl(ArrayList<String> arrayList) {
        HashSet<String> set = new HashSet<>();

        for (String url : arrayList) {
            String urlName = getUrlName(url);
            System.out.println(urlName);
            if (!set.contains(urlName)) {
                set.add(urlName);
            } else {
                arrayList.remove(url);
            }
        }

        return arrayList;
    }

    private String getUrlName(String urlName){
        int start = urlName.indexOf("http://");
        int end = urlName.indexOf(".com");

        return urlName.substring(start + LENGTH_OG_HTTPS + 4, end);
    }
}
