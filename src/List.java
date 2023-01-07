public class List {
    
    private Node first;
    private Node last;

    public List(){
        this.first=null;
        this.last=null;
    }

    public void unshift(int info){
        Node newNode = new Node(info);
        if(this.isEmpty()){
            this.first= newNode;
            this.last=newNode;
        }else{
            newNode.setLink(this.first);
            this.first= newNode;
        }
    }

    public void push(int info){
        Node newNode = new Node(info);
        if(this.isEmpty()){
            this.first= newNode;
            this.last=newNode;
        }else{
            this.last.setLink(newNode);
            this.last= newNode;
            this.last.setLink(null);
        }
    }
    public boolean isEmpty() {
        return this.first == null;
    }

    public boolean search(int info){
        Node newNode =first;
        int cont=0;
        while(newNode.getLink()!= null){
            if(newNode.getInfo()==info){
                return true;
            }         
            newNode=newNode.getLink();
        }
        return false;
    }
    public boolean shift (){
        if(this.isEmpty()){
            return false;
        }else if(this.first.getLink()==null){
            this.first=null;
            this.last=null;
            return true;
        }
        Node temp=this.first;
        this.first=this.first.getLink();
        temp=null;
        return true;
    }

    public boolean pop(){
        if(this.isEmpty()){
            return false;
        }else if(this.first.getLink()==null){
            this.first=null;
            this.last=null;
            return true;
        }
        Node temp=this.first;
        Node aux = this.first;
        while(temp.getLink()!= null){
            aux = temp;
            temp= temp.getLink();
        }
        this.last=aux;
        this.last.setLink(null);
        temp=null;
        aux= null;
        return true;
    }

    public String print(){
        String str="";
        Node temp = this.first;
        while(temp.getLink()!= null){
            str+=" "+temp.getInfo();
            temp= temp.getLink();
        }
        return str;
    }
}
