package Program_15 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: T_B[T_A], c: B) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_B[T_B[T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_B() => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)