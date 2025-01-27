package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Byte) extends T_A[E]
case class CC_C[F](a: F) extends T_A[F]
case class CC_D[G]() extends T_B[CC_C[CC_B[Byte]], G]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}