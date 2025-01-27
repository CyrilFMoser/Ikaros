package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: Char) extends T_A[B]
case class CC_B[C, D](a: T_A[C], b: T_A[C], c: Byte) extends T_A[C]
case class CC_C(a: T_A[T_B], b: (T_B,T_B), c: T_A[T_B]) extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_B Int T_B (CC_A Int Wildcard Char (T_A Int)) Wildcard Wildcard (T_A Int))
// This is not matched: (CC_D T_B)