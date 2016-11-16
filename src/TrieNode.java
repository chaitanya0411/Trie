
public class TrieNode
{
    private Character alphabet;
    private boolean isLeaf;
    private TrieNode[] children;
    
    public TrieNode()
    {
        this.isLeaf = false;
        this.children = new TrieNode[26];
        this.alphabet = '$';
    }
    
    public TrieNode(Character alphabet)
    {
        this.isLeaf = false;
        this.children = new TrieNode[26];
        this.alphabet = alphabet;
    }
    
    public boolean getIsLeaf()
    {
        return isLeaf;
    }
    
    public void setIsLeaf(boolean isLeaf)
    {
        this.isLeaf = isLeaf;
    }
    
    public TrieNode[] getChildren()
    {
        return children;
    }
    
    public Character getAlphabet()
    {
        return alphabet;
    }
    
}
