package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_B, c: T_B) extends T_A[B]
case class CC_B() extends T_A[(T_B,(Int,Boolean))]
case class CC_C() extends T_B
case class CC_D[C](a: T_A[C], b: C, c: CC_B) extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(_, _, _) => 1 
  case CC_D(CC_B(), _, CC_B()) => 2 
  case CC_D(CC_A(_, _, _), _, CC_B()) => 3 
  case CC_E() => 4 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_D T_B Wildcard Wildcard Wildcard T_B)