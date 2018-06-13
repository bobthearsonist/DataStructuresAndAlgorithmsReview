class SortedIntegerSumsTest extends org.scalatest.FunSuite {
  test("the target is contained in the set") {
    assert(SortedIntegerSums.ContainsSum(Array(1, 2, 3, 4, 5), 7) == true);
  }
  test("the target is not contained in the set") {
    assert(SortedIntegerSums.ContainsSum(Array(1, 2, 3, 4, 5), 24) == false);
  }
  test("there is not a apir to sum") {
    assert(SortedIntegerSums.ContainsSum(Array(1), 1) == false);
  }
  test("the array is empty"){
    assert(SortedIntegerSums.ContainsSum(Array(),12)==false);
  }
}