package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_B, b: B) extends T_A[B]
case class CC_B(a: T_A[(Byte,Boolean)], b: CC_A[Char]) extends T_B
case class CC_C(a: CC_B, b: T_A[CC_B], c: CC_A[Byte]) extends T_B
case class CC_D[C](a: T_B) extends T_B

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_), CC_C(_, _, _)) => 0 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _)) => 1 
  case CC_A(CC_D(_), _) => 2 
  case CC_A(CC_B(_, _), CC_C(_, _, _)) => 3 
  case CC_A(CC_C(_, _, _), _) => 4 
}
}
// This is not matched: (CC_A (CC_C (T_A T_B) T_B T_B T_B)
//      (CC_D T_B (CC_D T_B (CC_D T_B (CC_D T_B Wildcard T_B) T_B) T_B) T_B)
//      Wildcard
//      (T_A (CC_C (T_A T_B) T_B T_B T_B)))
// This is not matched: Pattern match is empty without constants