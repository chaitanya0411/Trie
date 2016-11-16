public class Trie
{
	private TrieNode root;

    public Trie()
    {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word)
    {
        TrieNode node = root, prev = root;
        
        int n = word.length();
        
        int i;
        
        for(i = 0; i < n; i++)
        {
            int pos = (word.charAt(i) - 'a') % 26;

            if(null != node.getChildren()[pos])
            {
                prev = node;
                node = node.getChildren()[pos];
            }
            else
            {
                break;
            }
        }
        
        if(i < n)
        {
            for(int j = i; j < n; j++)
            {
                TrieNode newNode = new TrieNode(word.charAt(j));
                node.getChildren()[(word.charAt(j) - 'a') % 26] = newNode;
                prev = node;
                node = newNode;
            }
        }
        node.setIsLeaf(true);
    }

    // Returns if the word is in the trie.
    public boolean search(String word)
    {
        TrieNode node = root;
        
        int i;
        
        for(i = 0; i < word.length(); i++)
        {
            int pos = (word.charAt(i) - 'a') % 26;
            
            if(null != node.getChildren()[pos])
            {
                node = node.getChildren()[pos];
            }
            else
            {
                break;
            }
        }
        
        if(i == word.length() && node.getIsLeaf())
        {
            return true;
        }
        
        return false;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix)
    {
        TrieNode node = root;
        
        int i;
        
        for(i = 0; i < prefix.length(); i++)
        {
            int pos = (prefix.charAt(i) - 'a') % 26;
            
            if(null != node.getChildren()[pos])
            {
                node = node.getChildren()[pos];    
            }
            else
            {
                break;
            }
        }
        
        if(i == prefix.length())
        {
            return true;
        }
        
        return false;
    }
}
