package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(T_A,T_A)], b: T_A) extends T_A
case class CC_B[B](a: (T_A,T_B[CC_A]), b: CC_A) extends T_A
case class CC_C(a: Byte, b: CC_B[CC_A]) extends T_A
case class CC_D(a: CC_B[CC_A], b: (Boolean,T_B[(Byte,Char)]), c: CC_B[((Boolean,Char),CC_C)]) extends T_B[(T_A,CC_A)]
case class CC_E(a: CC_B[CC_D], b: T_B[(T_A,CC_A)]) extends T_B[(T_A,CC_A)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B((_,_), CC_A(_, _)) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A(_, _)