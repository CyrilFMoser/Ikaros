package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Char, E]
case class CC_B[F](a: F, b: T_A[F, F]) extends T_A[Char, F]
case class CC_C(a: Byte) extends T_A[Char, CC_A[Byte]]
case class CC_D[G](a: T_A[Char, G]) extends T_B[Char, G]

val v_a: T_A[Char, CC_C] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}