package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[T_A[D], D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[T_A[T_A[Int]]]
case class CC_C[F](a: T_B[F, F], b: T_A[F], c: CC_B[T_A[F]]) extends T_B[F, Byte]
case class CC_D() extends T_B[Int, Byte]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}