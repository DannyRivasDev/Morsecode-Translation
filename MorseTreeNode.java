public class MorseTreeNode 
    {
        protected MorseTreeNode parent;
        protected MorseTreeNode leftChild;
        protected MorseTreeNode rightChild;
        protected Object element;
        
        public MorseTreeNode () 
        {
            
        }
        
        public MorseTreeNode(Object o) 
        {
            setElement(o);
        }
        
        public void setParent (MorseTreeNode n) 
        {
            parent = n;
        }
        
        public MorseTreeNode getParent() 
        {
            return parent;
        }
        
        public void setLeftChild (MorseTreeNode child) 
        {
            leftChild = child;
        }
        
        public void setRightChild (MorseTreeNode child) 
        {
            rightChild = child;
        } 
        
        public boolean hasLeftChild () 
        {
            return (leftChild != null);
        } 
    
        public boolean hasRightChild () 
        {
            return (rightChild != null);
        } 
        
        public void setElement (Object o) 
        {
            element = o;
        } 
        
        public MorseTreeNode getLeftChild() 
        {
            return (MorseTreeNode) leftChild;
        } 
        
        public MorseTreeNode getRightChild() 
        {
            return (MorseTreeNode) rightChild;
        } 
        
        public Object element() 
        {
            return element;
        } 
        
    }