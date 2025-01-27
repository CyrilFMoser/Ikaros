package Program_12 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D, F](a: D, b: T_B[E]) extends T_A[D, E]
case class CC_B[G]() extends T_B[G]
case class CC_C(a: T_A[Int, Byte], b: T_A[Byte, Boolean], c: T_A[Boolean, Int]) extends T_B[T_B[Char]]
case class CC_D(a: T_A[CC_C, CC_C]) extends T_B[T_B[Char]]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_A(_, CC_B()) => 1 
}
}
// This is not matched: (CC_A Char Char Boolean Wildcard Wildcard (T_A Char Char))
// This is not matched: Pattern match is empty without constants