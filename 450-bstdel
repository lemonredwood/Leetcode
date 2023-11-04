/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
struct TreeNode* findmin(struct TreeNode* root){
    while(root->left){
        root = root->left;
    }
    return root;
}
struct TreeNode* deleteNode(struct TreeNode* root, int key) {
    if(root==NULL)return NULL;
    if(root->val>key){
        root->left = deleteNode(root->left,key);
    }
    else if(root->val<key){
        root->right = deleteNode(root->right,key);
    }
    else{
        if(!root->left){
            struct TreeNode* temp = root->right;
            return temp;
        }
        else if (!root->right){
            struct TreeNode* temp = root->left;
            return temp;
        }
        struct TreeNode* temp = findmin(root->right);
        root->val = temp->val;
        root->right = deleteNode(root->right,temp->val);
    }
    return root;
}