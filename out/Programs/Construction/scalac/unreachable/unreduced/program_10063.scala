package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_B[Char]) extends T_A
case class CC_B(a: T_B[((Int,Byte),Byte)], b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Int, b: Byte, c: Byte) extends T_B[T_A]
case class CC_E(a: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 2 
  case CC_B(_, CC_B(_, CC_C())) => 3 
  case CC_B(_, CC_C()) => 4 
  case CC_C() => 5 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_B(_, _)))