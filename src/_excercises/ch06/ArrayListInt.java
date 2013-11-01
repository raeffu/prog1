package _excercises.ch06;

import java.util.Arrays;

public class ArrayListInt {

  private int[] array;
  private int size; // number of filled in values

  /*
   * Constructor
   */
  public ArrayListInt() {
    array = new int[100];
    size = 0;
  }

  public ArrayListInt(int initialLength) {
    array = new int[initialLength];
    size = 0; // next free space
  }

  /*
   * Methods
   */
  public int get(int index) {
    return array[index];
  }

  public void set(int index, int element) {
    array[index] = element;
  }

  public int getSize() {
    return size;
  }

  public void add(int element) {
    if (size >= array.length) {
      this.grow();
    }

    array[size] = element;
    size++;
  }

  public void insert(int index, int element) {
    for (int i = size; i > index; i--) {
      if (i == size) {
        this.add(array[i - 1]);
      } else {
        array[i] = array[i - 1];
      }
    }

    if (index >= size) {
      this.add(element);
    } else {
      array[index] = element;
    }
  }

  public void remove(int index) {
    if (index < size) {
      array[index] = array[size - 1];
      size--;
    }

    if (array.length / size >= 2) {
      this.shrink();
    }
  }

  public String toString() {
    String values = "";
    for (int element : array) {
      values += element + ", ";
    }

    // remove last ", "
    values = values.substring(0, values.length() - 2);

    return "[" + values + "]";
  }

  private void grow() {
    array = Arrays.copyOf(array, array.length * 2);
  }

  private void shrink() {
    array = Arrays.copyOf(array, array.length / 2);
  }
}
