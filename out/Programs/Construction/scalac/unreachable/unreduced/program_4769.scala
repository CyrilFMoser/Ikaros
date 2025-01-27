package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, T_A[F, F]], b: Byte) extends T_A[F, T_A[F, F]]
case class CC_C[G]() extends T_A[G, T_A[G, G]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
  case CC_B(CC_C(), _) => 3 
  case CC_C() => 4 
}
}