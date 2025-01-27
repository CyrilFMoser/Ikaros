package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: T_A, b: T_A, c: Byte) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A
case class CC_D[C, D]() extends T_B[C, D]
case class CC_E[E]() extends T_B[T_B[E, E], E]
case class CC_F[F](a: T_A, b: F, c: Int) extends T_B[F, CC_A]

val v_a: CC_D[Char, Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}