package Program_29 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B[B](a: B, b: B, c: T_B[CC_A]) extends T_A
case class CC_C[C](a: Byte) extends T_B[C]
case class CC_D[D](a: T_A, b: T_B[D]) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _)) => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(_, _, CC_C(_)) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C Boolean (CC_B Boolean (T_A Boolean)) Wildcard (T_A Boolean))