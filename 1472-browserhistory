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

void browserHistoryVisit(BrowserHistory* obj, char* url) {
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
