package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[Int, (Int,Byte)], b: CC_A[Char, Char], c: T_A[Byte, Char]) extends T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]]

val v_a: T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}
// This is not matched: (CC_A (T_A Int Int)
//      Boolean
//      (T_A (T_A Int Int) (T_A (T_A Int Int) (T_A Int Int))))
// This is not matched: (CC_A Char Wildcard Wildcard T_A)