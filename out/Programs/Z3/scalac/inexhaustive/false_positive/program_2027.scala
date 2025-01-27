package Program_30 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int) extends T_A
case class CC_B[B](a: Boolean, b: CC_A) extends T_A
case class CC_C(a: T_B[T_A], b: Int, c: T_A) extends T_A
case class CC_D[C](a: C, b: Int, c: C) extends T_B[C]
case class CC_E(a: Boolean) extends T_B[T_B[CC_A]]
case class CC_F() extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_C(_, _, CC_C(_, _, _)) => 2 
  case CC_C(_, _, _) => 3 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Wildcard T_A)