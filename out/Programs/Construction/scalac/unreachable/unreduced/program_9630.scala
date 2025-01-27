package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[E], c: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_B[(T_A[(Char,Char)],T_B[Char, Char]), F]
case class CC_D[G]() extends T_B[CC_A[G], G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
}
}