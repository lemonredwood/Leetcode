//Browser History
typedef struct BrowserHistory{
    struct BrowserHistory* previous;
    char* url;
    struct BrowserHistory* next;    
} BrowserHistory;

struct BrowserHistory* current=NULL;

BrowserHistory* browserHistoryCreate(char* homepage) {
    BrowserHistory* newpage = malloc(sizeof(BrowserHistory));
    newpage->previous = NULL;
    newpage->url = homepage;
    newpage->next = NULL;
    return newpage;
}

void browserHistoryVisit(BrowserHistory* obj, char* url) {class BrowserHistory {
    private Stack<String> st1 = new Stack();
    private Stack<String> st2 = new Stack();
    public BrowserHistory(String homepage) {
        st1.push(homepage);
    }
    
    public void visit(String url) {
        st2.clear();
        st1.push(url);
    }
    
    public String back(int steps) {
        for(int i=0;i<steps;i++){
            if(!st1.empty()){
                st2.push(st1.pop());
            }
        }
        if(st1.empty())st1.push(st2.pop());
        return st1.peek();    
    }
    
    public String forward(int steps) {
        for(int i=0;i<steps;i++){
            if(!st2.empty()){
                st1.push(st2.pop());
            }
        }
        return st1.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */
    if(obj==NULL){
        current = browserHistoryCreate(url);
    }
    else{
        current = obj;
        while(current->next){
            current=current->next;
        }
            BrowserHistory* new = browserHistoryCreate(url);
        current->next = new;
        new->previous = current;
        current = new;
    }
}

char* browserHistoryBack(BrowserHistory* obj, int steps) {
    for(int i=0;i<steps;i++){
        if(current->previous!=NULL && obj!=NULL){
            current = current->previous;
        }
    }
    return current->url;
}

char* browserHistoryForward(BrowserHistory* obj, int steps) {
    
    for(int i=0;i<steps;i++){
        if(current->next!=NULL && obj!=NULL){
            current = current->next;
        }
    }
    return current->url;
}

void browserHistoryFree(BrowserHistory* obj) {
    free(obj);
}



/**
* Your BrowserHistory struct will be instantiated and called as such:
* BrowserHistory* obj = browserHistoryCreate(homepage);
* browserHistoryVisit(obj, url);

* char* param_2 = browserHistoryBack(obj, steps);

* char* param_3 = browserHistoryForward(obj, steps);

* browserHistoryFree(obj);
*/
