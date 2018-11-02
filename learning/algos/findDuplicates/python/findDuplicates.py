def find_duplicates(arr1, arr2):
	return [x for x in arr1 if x in arr2]
 
if __name__ == "__main__":
	print(find_duplicates([1, 2, 3, 5, 6, 7], [3, 6, 7, 8, 20]))