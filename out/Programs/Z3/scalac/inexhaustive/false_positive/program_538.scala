package Program_31 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants