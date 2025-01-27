package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[Boolean, T_A], b: CC_A) extends T_A
case class CC_C[C]() extends T_A
case class CC_D(a: T_A, b: Int, c: T_A) extends T_B[(T_B[Byte, CC_B],(CC_A,T_A)), Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
}
}
// This is not matched: CC_C()