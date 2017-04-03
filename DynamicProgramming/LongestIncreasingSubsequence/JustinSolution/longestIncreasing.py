
def getLengthOfLongestIncreasingSubsequence(array):
  # seed the array with 1 then start from the second index
  tempArray = [1]
  for i in range(1, len(array)):
    if array[i] > array[i-1]:
      tempArray.append(tempArray[i-1] + 1)
    else:
      tempArray.append(tempArray[i-1])

  return tempArray[i-1]

if __name__ == '__main__':
  testArray = [10, 9, 2, 5, 3, 7, 101, 18]
  longestIncreasingSubsequence = getLengthOfLongestIncreasingSubsequence(testArray)
  print ("Longest Increasing Subsequence: " + str(longestIncreasingSubsequence))
