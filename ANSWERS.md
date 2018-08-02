## Lab 10 Written Answers

   - Written part: Discuss the differences among the results. Does the starting point make a difference?
   
      - Breadthfirst iteration starting from France:
      
France,
Spain,
Switzerland,
Italy,
Germany,
Belgium,

      - Breadthfirst iteration starting from Switzerland:
      
Switzerland,
France,
Germany,
Italy,
Spain,
Belgium,

      - ClosestFirstIterator<> iteration starting from France:
      
France,
Spain,
Switzerland,
Italy,
Germany,
Belgium,

      - ClosestFirstIterator<> iteration starting from Switzerland:
      
Switzerland,
France,
Germany,
Italy,
Spain,
Belgium,

      - DepthFirstIterator<> iteration starting from France:
      
France,
Belgium,
Germany,
Switzerland,
Italy,
Spain,

      - DepthFirstIterator<> iteration starting from Switzerland:
      
Switzerland,
Italy,
France,
Belgium,
Germany,
Spain,

      - RandomWalkIterator iteration starting from France:
      
Belgium,
Germany,
France,
Switzerland,
Italy,
Switzerland,

      - RandomWalkIterator iteration starting from Switzerland:
      
Germany,
Belgium,
Germany,
Belgium,
France,
Belgium,



   - Written part: Discuss how ClosestFirstIterator and RandomWalkIterator work.
   
      - RandomWalkIterator randomly takes a path starting from a random vertex. ClosestFirstIterator will start taking a path at a connected vertex then traverses regardless of vertex connections. 
      
   - Written part: Give two or three examples of how/why a real-world map might require more than four colors.
  
      - If a country has a portion of its territory not connected to the mainland a fith color could be necessary.
      - If a country splits in two and a new country is created, such as South Sudan, more than four colors could be necessary. 
