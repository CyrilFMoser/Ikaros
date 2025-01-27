package Program_31 

package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B(a: CC_A[T_B, T_B]) extends T_A[(Int,Byte), Int]
case class CC_C(a: T_A[CC_B, T_B]) extends T_B
case class CC_D[E](a: T_A[E, E], b: E) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_D(CC_A(), _) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard T_B)
// This is not matched: (CC_C Wildcard Wildcard T_A)