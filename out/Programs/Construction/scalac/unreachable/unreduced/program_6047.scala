package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F](a: Int, b: T_B[F, F], c: F) extends T_A[F]
case class CC_D[G](a: (T_A[Byte],CC_B[Char]), b: T_B[G, T_B[G, G]]) extends T_B[CC_A[T_A[Char]], G]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}