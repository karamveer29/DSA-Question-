public class Occurrence {
    public static int first = -1;
    public static int last = -1;
    public static void getIndices(String str, int idx, char el){
        if(idx == str.length()){
            return;
        }
        if(str.charAt(idx) == el){
            if(first == -1){
                first = idx;
                
            }else{
                last = idx;
            }
        }
        getIndices(str, idx+1, el);
    }

    public static void main(String[] args) {
        String str = "abcdfghijakk";
        char el ='a';
        getIndices(str, el, 0);
        System.out.println("First Occurance"+first);
        System.out.println("Last Occurance"+last);
    }
}
