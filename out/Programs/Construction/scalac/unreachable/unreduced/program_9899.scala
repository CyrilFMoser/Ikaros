package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_B[E, E], c: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: Int, c: Byte) extends T_B[F, T_B[F, F]]
case class CC_D[G, H]() extends T_B[G, T_B[G, G]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, CC_A()) => 1 
  case CC_B(CC_A(), _, CC_B(_, _, _)) => 2 
}
}