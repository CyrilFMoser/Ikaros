package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: F) extends T_A[F]
case class CC_D[G](a: G, b: T_A[T_B[G, G]], c: Byte) extends T_B[CC_A[CC_A[Int]], G]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}