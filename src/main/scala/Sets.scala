object SortedIntegerSums {
  //given an ordered set of real integers return a boolean indicating if a pair exists equaling the target
  def ContainsSum(sorted: Array[Int], target: Int):Boolean ={
    var left = 0
    var right = sorted.length-1
    while (left<right){
      val sum = sorted(left)+sorted(right)
      if(sum==target) return true;
      else if(sum < target) left+=1
      else if(sum > target) right-=1
    }
    return false;
  }
}
