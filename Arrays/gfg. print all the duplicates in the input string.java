//https://www.geeksforgeeks.org/print-all-the-duplicates-in-the-input-string/

static void printDups(String str)
  {
    Map<Character, Integer> count = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char ch=str.charAt(i);
        count.put(ch,count.getOrDefault(ch,0)+1);
    }
    for (Map.Entry<Character,Integer> mapElement : count.entrySet()) { 
      if (mapElement.getValue() > 1)
        System.out.println(mapElement.getKey() + ", count = " + mapElement.getValue());
    }
  }