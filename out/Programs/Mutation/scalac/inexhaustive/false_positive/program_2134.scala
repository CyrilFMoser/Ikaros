package Program_31 

package Program_25 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_B()) at position 0