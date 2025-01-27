package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: ((T_A,Char),T_B[T_A, T_A]), b: Boolean) extends T_A
case class CC_B(a: T_B[T_B[T_A, (Byte,Char)], T_B[Char, T_A]]) extends T_A
case class CC_C(a: Byte) extends T_A
case class CC_D[C]() extends T_B[C, (Boolean,CC_A)]
case class CC_E[D](a: (CC_B,T_A), b: CC_B) extends T_B[D, (Boolean,CC_A)]
case class CC_F[E](a: E, b: T_B[E, (Boolean,CC_A)]) extends T_B[E, (Boolean,CC_A)]

val v_a: T_B[Char, (Boolean,CC_A)] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E((CC_B(_),CC_A(_, _)), _) => 1 
  case CC_E((CC_B(_),CC_B(_)), _) => 2 
  case CC_E((CC_B(_),CC_C(_)), _) => 3 
  case CC_F(_, _) => 4 
}
}