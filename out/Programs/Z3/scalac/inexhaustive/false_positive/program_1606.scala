package Program_29 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B) extends T_A
case class CC_B(a: T_A, b: T_A) extends T_A
case class CC_C[B](a: B, b: CC_A[B], c: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), _) => 0 
  case CC_C(_, _, CC_B(_, _)) => 1 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_B)
// This is not matched: Pattern match is empty without constants