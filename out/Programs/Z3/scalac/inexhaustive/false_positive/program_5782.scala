package Program_15 

package Program_14 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(CC_B(_, _, _), _, _) => 4 
  case CC_B(_, CC_A(), CC_B(_, _, _)) => 5 
  case CC_B(CC_A(), CC_A(), CC_B(_, _, _)) => 6 
  case CC_B(_, CC_A(), CC_A()) => 7 
  case CC_B(CC_A(), CC_B(_, _, _), _) => 8 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A T_A T_A)