package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_B[Char], b: CC_A) extends T_A
case class CC_C[B](a: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants