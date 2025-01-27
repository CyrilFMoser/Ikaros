package Program_13 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B[A](a: Int, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants