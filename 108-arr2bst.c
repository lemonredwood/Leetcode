/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* create(int val){
    struct TreeNode* new = (struct TreeNode*)malloc(sizeof(struct TreeNode));
    new->val = val;
    new-> left = NULL;
    new-> right = NULL;
    return new;
}

struct TreeNode* insert(struct TreeNode* root, int val){
    if(root==NULL){
        return create(val);
    }
    if(root->val>val){
        root = insert(root->left,val);
    }
    else if(root->val<val){
        root = insert(root->right,val);
    }
    return root;
}

struct TreeNode* inorder(struct TreeNode* root, int* arr,int* count){
    root=inorder(root->left,arr,count);
    arr[*count++]=root->val;
    root=inorder(root->right,arr,count);
    return root;
}
struct TreeNode* sortedArrayToBST(int* nums, int numsSize){
    struct TreeNode* root;
    int arr[numsSize];
    int count=0;
    for(int i=numsSize/2;i<numsSize;i++){
        root = insert(root,nums[i]);   
    }
    for(int i=(numsSize/2)-1;i>=0;i--){
        root = insert(root,nums[i]);  
    }
    struct TreeNode* root1;
    inorder(root1,arr,&count);
    return root;
}