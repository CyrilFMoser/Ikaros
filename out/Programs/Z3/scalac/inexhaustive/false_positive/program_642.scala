package Program_30 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_B[T_B[CC_A]]
case class CC_C[B](a: CC_B, b: CC_B, c: ((Boolean,Char),T_A)) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_B(_, _) => 2 
  case CC_B(_, CC_A()) => 3 
  case CC_C(_, _, _) => 4 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard (T_B (T_B (CC_A T_A))))
// This is not matched: (CC_C Boolean (CC_B Boolean (T_A Boolean)) Wildcard (T_A Boolean))