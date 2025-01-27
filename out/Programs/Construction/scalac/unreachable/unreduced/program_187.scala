package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_B[T_A, Byte], b: T_A, c: Byte) extends T_A
case class CC_C[C](a: C) extends T_B[C, Char]
case class CC_D[D](a: Boolean, b: Char) extends T_B[D, Char]
case class CC_E[E](a: CC_A, b: E, c: CC_B) extends T_B[E, Char]

val v_a: CC_C[T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B(_, _, _)) => 1 
}
}