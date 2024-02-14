class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        answer=new int[3][3];
        System.out.println(arr.length+"+"+arr[0].length);
        if(arr.length>arr[0].length){
            answer=new int[arr.length][arr[0].length+(arr.length-arr[0].length)];
            for(int i=0; i<answer.length; i++){
                for(int j=0; j<answer[0].length; j++){
                    if(j>=arr[0].length){
                        answer[i][j]=0;
                    }else{
                       answer[i][j]=arr[i][j];    
                    }
                    
                }
            }
        }else if(arr.length<arr[0].length){
            answer=new int[arr.length+(arr[0].length-arr.length)][arr[0].length];
            for(int i=0; i<answer.length; i++){
                for(int j=0; j<answer[0].length; j++){
                    if(i>=arr.length){
                        answer[i][j]=0;
                    }else{
                        answer[i][j]=arr[i][j];
                    }
                }
            }
        }else{
            answer=new int[arr.length][arr[0].length];
            for(int i=0; i<arr.length; i++){
                for(int j=0; j<arr[0].length; j++){
                    answer[i][j]=arr[i][j];
                }
            }
        }
        return answer;
    }
}