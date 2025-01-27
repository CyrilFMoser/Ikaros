package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, Byte]
case class CC_B[F](a: F) extends T_B[F, T_A[F, Byte]]
case class CC_C[G](a: CC_B[G], b: T_B[G, G]) extends T_B[G, T_A[G, Byte]]
case class CC_D[H]() extends T_B[H, T_A[H, Byte]]

val v_a: T_B[Int, T_A[Int, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), _) => 2 
  case CC_D() => 3 
}
}