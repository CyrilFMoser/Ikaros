package Program_14 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D]) extends T_A[C]
case class CC_B() extends T_B[CC_A[Byte, Char]]
case class CC_C(a: Byte, b: CC_A[CC_B, CC_B], c: T_A[CC_B]) extends T_B[CC_A[Byte, Char]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard (T_A Int))
// This is not matched: (CC_B Wildcard T_A)