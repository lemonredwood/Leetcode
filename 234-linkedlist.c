//Given the head of a singly linked list, return true if it is a palindrome or false otherwise.


/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
	public:
		bool isPalindrome(ListNode* head) {
			ListNode* h1 = head;
			ListNode* h2 = head;
			int x=0;
			int y=0;
			vector<int> vec;
			if(head->next!=NULL){
				while(h1!=NULL){
					vec.push_back(h2->val);
					if(h1->next==NULL){
						y=1;
					}
					else{
						y=0;
                        h1=h1->next;
					}
                    h1=h1->next;
                    h2=h2->next;
				}
				int n =vec.size();
				if(y==0){
					for(int j=n-1;j>=0;j--){
						if(h2->val!=vec[j]){
							x++;
						}
						h2=h2->next;
					}
				}
				else{
					for(int j=n-2;j>=0;j--){
						if(h2->val!=vec[j]){
							x++;
						}
						h2=h2->next;
					}
				}
            }
			else{
				return 1;
			}
            free(h1);
            free(h2);
			if(x==0){
				return 1;
			}
			return 0;
		}
        
};
