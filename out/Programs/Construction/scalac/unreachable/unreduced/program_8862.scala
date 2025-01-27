package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[CC_A], b: T_B[T_B[CC_A]]) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Byte, b: Byte, c: (T_A,Byte)) extends T_B[T_A]
case class CC_E(a: (CC_A,T_B[T_A])) extends T_B[T_A]
case class CC_F(a: T_B[Byte], b: CC_C) extends T_B[T_A]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E((CC_A(_),CC_E(_))) => 1 
  case CC_E((CC_A(_),CC_F(_, _))) => 2 
  case CC_F(_, CC_C()) => 3 
}
}
// This is not matched: CC_E((CC_A(_),CC_D(_, _, _)))