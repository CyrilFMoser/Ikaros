package Program_15 

package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B, c: T_B) extends T_A[B]
case class CC_B[C](a: T_A[C], b: CC_A[C]) extends T_A[C]
case class CC_C(a: T_B, b: Boolean) extends T_B
case class CC_D[D](a: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: (CC_D T_B Wildcard T_B)
// This is not matched: (CC_C Int T_B)