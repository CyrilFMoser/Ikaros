package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Int], c: T_A[Boolean]) extends T_A[T_A[Char]]
case class CC_B[B, C](a: Char, b: T_A[B], c: C) extends T_A[B]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _, _), _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_B Int Byte Wildcard Wildcard Byte (T_A Int))
// This is not matched: (CC_C Int T_A Wildcard Wildcard Wildcard (T_B T_A Int))