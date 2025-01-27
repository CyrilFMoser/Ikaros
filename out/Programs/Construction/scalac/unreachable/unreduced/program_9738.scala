package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: Byte) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, CC_A], b: T_A, c: CC_B) extends T_A
case class CC_D[C](a: T_A, b: T_A) extends T_B[Byte, C]
case class CC_E(a: ((CC_A,CC_C),CC_C), b: Int) extends T_B[Byte, T_B[CC_B, CC_D[CC_A]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, CC_A(_, _, _), CC_B()) => 1 
  case CC_C(_, CC_B(), CC_B()) => 2 
  case CC_C(_, CC_C(_, CC_A(_, _, _), CC_B()), CC_B()) => 3 
  case CC_C(_, CC_C(_, CC_B(), CC_B()), CC_B()) => 4 
  case CC_C(_, CC_C(_, CC_C(_, _, _), CC_B()), CC_B()) => 5 
}
}
// This is not matched: CC_B()