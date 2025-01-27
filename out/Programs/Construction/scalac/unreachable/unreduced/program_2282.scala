package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: E) extends T_A[E]
case class CC_C[F](a: (CC_A[Int],T_A[Boolean]), b: T_A[F]) extends T_B[F, T_A[F]]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, CC_B(_, _)) => 1 
}
}