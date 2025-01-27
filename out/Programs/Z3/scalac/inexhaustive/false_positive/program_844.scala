package Program_30 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: CC_A) extends T_A
case class CC_C[C]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C() => 1 
  case CC_B(CC_A(), _) => 2 
  case CC_B(CC_A(), CC_A()) => 3 
  case CC_B(_, CC_A()) => 4 
  case CC_B(CC_B(_, _), CC_A()) => 5 
  case CC_B(CC_B(_, _), _) => 6 
}
}
// This is not matched: (CC_C T_A T_A)
// This is not matched: Pattern match is empty without constants