class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[]bucket = new List[nums.length+1];
        Map<Integer,Integer> frequencyMap = new HashMap<>();

        //making the frequency hashmap
        for(int n : nums){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);

        }
        
        //iterating unique elemtns
        for(int key : frequencyMap.keySet()){
            //get the elemnt present on the particular index(frequency)
            int frequency = frequencyMap.get(key);

            // if frequency index doesnt exist then creating one  
            if(bucket[frequency]==null){
                bucket[frequency]= new ArrayList<>();

            }     

            // if frequency index exists then add the particular element corresponding to its frequncy at the index
            bucket[frequency].add(key);   
        }

        //iterating throught the bucket in revers to find top k
        int res[]=new int[k];
        int counter =0;
        for(int pos= bucket.length-1;pos>=0 && counter<k;pos--){
            if(bucket[pos]!=null){
                for(Integer integer : bucket[pos]){
                    res[counter++]= integer;
                }
            }
        }
        return res;
        
    }
}