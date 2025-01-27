package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (Boolean,T_B[T_A, T_A])) extends T_A
case class CC_B[C](a: T_A, b: C, c: T_B[Byte, C]) extends T_A
case class CC_C(a: CC_B[T_B[CC_A, T_A]], b: Int) extends T_A
case class CC_D[D](a: CC_B[D], b: T_A, c: Byte) extends T_B[CC_A, D]
case class CC_E[E](a: CC_B[CC_A]) extends T_B[CC_A, E]

val v_a: T_B[CC_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A((_,_)), _) => 0 
  case CC_D(_, CC_B(_, _, _), _) => 1 
  case CC_D(_, CC_C(_, _), _) => 2 
  case CC_E(_) => 3 
}
}