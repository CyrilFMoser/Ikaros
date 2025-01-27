package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Byte) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[F]) extends T_B[F, T_A[CC_A[Int]]]

val v_a: T_B[Byte, T_A[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _) => 0 
  case CC_C(CC_B(_, _), _) => 1 
}
}