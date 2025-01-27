package Program_15 

package Program_8 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,(Boolean,Int)), b: T_A) extends T_A
case class CC_B() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_A(_, _) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard T_A)