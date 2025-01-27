package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: (CC_A[Boolean],T_B[Char]), b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]
case class CC_D[G](a: CC_A[G], b: T_B[G], c: T_A[G, T_A[G, G]]) extends T_B[G]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C()) => 3 
  case CC_C() => 4 
}
}