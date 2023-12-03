class Solution:
    def reverseWords(self, s: str) -> str:
        mylist = s.split()
        string=""
        for i in mylist:
            string+=(i[::-1]+' ')
        return string[:-1]
