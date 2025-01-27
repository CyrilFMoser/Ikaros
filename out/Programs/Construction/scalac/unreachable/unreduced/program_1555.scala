package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: (Boolean,T_A), b: T_B[T_A, T_A], c: CC_A) extends T_A
case class CC_C(a: Boolean, b: T_A) extends T_A
case class CC_D[C, D](a: CC_A, b: D, c: Boolean) extends T_B[(Byte,T_A), C]
case class CC_E[E](a: T_B[(Byte,T_A), E], b: CC_D[E, E]) extends T_B[(Byte,T_A), E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(_, _, _), _) => 1 
  case CC_A(_, CC_C(_, _), _) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(_, _) => 4 
}
}