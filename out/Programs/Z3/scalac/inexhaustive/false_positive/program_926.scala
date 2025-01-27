package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Byte, Byte], b: T_B[Boolean, Byte], c: T_A[Int]) extends T_A[T_A[Char]]
case class CC_B[D](a: CC_A, b: T_B[D, D], c: CC_A) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
}
}
// This is not matched: (CC_B Boolean Wildcard Wildcard Wildcard (T_A (T_A Char)))
// This is not matched: (CC_A Char (T_A Char))