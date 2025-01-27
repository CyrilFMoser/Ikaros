package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[((Char,Int),Boolean), T_B[T_A, T_A]], b: Boolean) extends T_A
case class CC_B[C](a: Byte) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D[D](a: T_B[D, T_A], b: CC_B[D]) extends T_B[(CC_B[Char],Boolean), D]
case class CC_E[E]() extends T_B[(CC_B[Char],Boolean), E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_)