package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_A, c: Boolean) extends T_A
case class CC_B(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_C(a: Byte) extends T_B[Boolean]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
  case CC_B(CC_A(_, CC_A(_, _, _), _), _, _) => 2 
  case CC_B(CC_A(_, CC_B(_, _, _), _), _, _) => 3 
  case CC_B(CC_B(CC_A(_, _, _), _, _), _, _) => 4 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 5 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_A(_, _, _), _), _)