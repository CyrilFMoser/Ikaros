package Program_14 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[D, D]) extends T_A[T_A[Int, Char], C]
case class CC_B(a: Int, b: CC_A[Int, Byte], c: CC_A[Char, Boolean]) extends T_A[T_A[Int, Char], CC_A[Int, Byte]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12, _, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Boolean (T_A Boolean))