package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D](a: T_B[Char, D]) extends T_B[Char, C]
case class CC_C[E](a: T_A, b: E, c: E) extends T_B[Char, E]
case class CC_D[F](a: Byte, b: T_B[Char, F], c: T_B[F, F]) extends T_B[Char, F]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
  case CC_D(_, _, _) => 2 
}
}