public int[] maxEnd3(int[] nums) {
  int largest;
  if(nums[0] > nums[2])
  {
    largest = nums[0];
    nums[1] = largest;
    nums[2] = largest;
  }
  else
  {
    largest = nums[2];
    nums[1] = largest;
    nums[2] = largest;
  }
  nums[0] = largest;
  return nums;
}
