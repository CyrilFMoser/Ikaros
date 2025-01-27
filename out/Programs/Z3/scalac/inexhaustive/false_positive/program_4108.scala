package Program_15 

package Program_2 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_B Byte Int Wildcard Wildcard (T_A Int Byte))