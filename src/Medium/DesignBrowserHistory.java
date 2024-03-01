package Medium;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/design-browser-history/

public class DesignBrowserHistory {

    private List<String> pages = new ArrayList<>();
    private Integer indexPage;

    public DesignBrowserHistory(String homepage) {
        pages.add(homepage);
        indexPage = 0;
    }

    public void visit(String url) {
        int size = pages.size();
        for (int i=indexPage+1; i<size; i++) {
            pages.remove(pages.size()-1);
        }

        pages.add(url);
        indexPage++;
    }

    public String back(int steps) {
        for (int i=0; i<steps; i++) {
            if (indexPage > 0) {
                indexPage--;
            }
        }

        return pages.get(indexPage);
    }

    public String forward(int steps) {
        for (int i=0; i<steps; i++) {
            if (indexPage < pages.size()-1) {
                indexPage++;
            }
        }

        return pages.get(indexPage);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
