package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: (T_A[Boolean],((Int,Int),Byte))) extends T_A[E]
case class CC_C[F](a: Boolean, b: F, c: T_A[F]) extends T_B[F, T_A[F]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, (_,_)) => 1 
}
}