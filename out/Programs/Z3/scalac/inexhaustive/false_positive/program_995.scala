package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_A, c: Byte) extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C[A]() extends T_A
case class CC_D(a: CC_B, b: Char, c: CC_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), _, _) => 0 
  case CC_C() => 1 
  case CC_B(CC_A(_, _, _), CC_B(_, _)) => 2 
  case CC_B(_, CC_C()) => 3 
  case CC_B(CC_A(_, _, _), _) => 4 
}
}
// This is not matched: (CC_C T_A T_A)
// This is not matched: (CC_C T_A T_A)