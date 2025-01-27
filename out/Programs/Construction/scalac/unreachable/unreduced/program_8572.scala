package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[T_A[Byte, Boolean]]]
case class CC_B[E](a: T_B[E], b: T_A[E, E]) extends T_B[E]
case class CC_C[F](a: CC_B[F], b: F) extends T_B[CC_B[(Int,Boolean)]]

val v_a: T_B[CC_B[(Int,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(CC_C(_, _), _) => 1 
  case CC_C(_, _) => 2 
}
}