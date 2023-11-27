/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

int i=0;
int num=0;
void numelements(struct TreeNode* )
void inorder(struct TreeNode* root, int* arr, int* i,int* num ){
    if(root==NULL){
        return;
    }
    inorder(root->left,arr,i,num);
    arr[(*i)++]=root->val;
    inorder(root->right,arr,i,num); 
}
int* inorderTraversal(struct TreeNode* root, int* returnSize){
    if(root==NULL){
        returnSize=0;
        return NULL;
    }
    int* arr = (int*)malloc(100 * sizeof(int));
    inorder(root,arr,i);
    *returnSize=i;
    
    return arr;
}