class CounterGroovy {
  static Map<Integer, Integer> countElements(int[] array) {
    array.inject([:]) { map, element ->
      map[element] = (map[element] ?: 0) + 1
      map
    }
  }
}
