package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: Byte, b: T_B[E, E], c: E) extends T_A[E]
case class CC_C[F](a: Boolean, b: T_A[F], c: Char) extends T_A[F]
case class CC_D[G](a: G, b: T_A[G], c: G) extends T_B[CC_C[G], G]
case class CC_E[H]() extends T_B[CC_C[H], H]

val v_a: T_B[CC_C[Int], Int] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(), _) => 0 
  case CC_D(_, CC_B(_, _, _), _) => 1 
  case CC_D(_, CC_C(_, _, _), _) => 2 
  case CC_E() => 3 
}
}