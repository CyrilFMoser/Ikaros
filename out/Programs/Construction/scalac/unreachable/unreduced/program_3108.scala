package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, Char]
case class CC_B[F](a: T_B[CC_A[F], F], b: T_A[F, T_A[F, Char]]) extends T_A[F, Char]
case class CC_C[G](a: CC_A[G], b: (Boolean,T_B[Byte, Boolean])) extends T_B[Byte, G]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}