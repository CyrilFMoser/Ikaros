package Program_11 

package Program_4 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants