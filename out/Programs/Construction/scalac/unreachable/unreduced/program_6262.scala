package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,T_B[T_A, T_A])) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Byte, b: CC_A) extends T_B[C, CC_C]
case class CC_E[D](a: (Int,(CC_C,CC_B))) extends T_B[D, CC_C]
case class CC_F[E](a: T_B[E, E]) extends T_B[CC_B, E]

val v_a: T_B[T_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A((_,_))) => 0 
  case CC_E(_) => 1 
}
}