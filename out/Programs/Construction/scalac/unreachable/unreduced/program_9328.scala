package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[Byte, T_A],T_B[(Char,Byte), T_A])) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[C, C]) extends T_B[CC_B, C]
case class CC_E[D](a: Boolean, b: T_A, c: CC_A) extends T_B[CC_B, D]

val v_a: T_B[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, _) => 1 
}
}