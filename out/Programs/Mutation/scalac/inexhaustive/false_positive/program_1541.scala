package Program_63 

package Program_15 

object Test {
sealed trait T_A
case class CC_A[A](a: Char) extends T_A
case class CC_B(a: (T_A,(Byte,Int))) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: (CC_C (T_A Char) (T_A (T_A Char)))
// Mutation information: 
// Deleted Pattern CC_B(_, _) at position 4