package Program_15 

package Program_3 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[A](a: CC_A, b: T_A, c: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, CC_B(_, _), _) => 3 
  case CC_C(_, _, _) => 4 
  case CC_C(CC_A(), _, _) => 5 
  case CC_C(CC_A(), CC_C(_, _, _), _) => 6 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_A (CC_B T_A) (CC_B T_A) Wildcard T_A)
//      (CC_A (CC_B T_A) (CC_B T_A) (CC_B T_A) T_A)
//      (CC_B T_A)
//      T_A)