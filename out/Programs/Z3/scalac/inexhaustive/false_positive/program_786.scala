package Program_30 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B[B](a: Int, b: B) extends T_A
case class CC_C(a: T_A, b: (T_A,T_A)) extends T_A

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_A(CC_C(_, _)) => 2 
}
}
// This is not matched: (CC_A Boolean (CC_B T_A Int Wildcard T_A) T_A)
// This is not matched: Pattern match is empty without constants