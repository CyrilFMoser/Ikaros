package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: T_A[D, D]) extends T_A[T_B[T_A[Boolean, Char]], D]
case class CC_B[E](a: T_B[E]) extends T_A[T_B[T_A[Boolean, Char]], E]
case class CC_C[F, G](a: T_A[G, G], b: CC_B[G], c: T_A[T_B[F], F]) extends T_A[F, G]
case class CC_D() extends T_B[CC_B[CC_A[Byte]]]
case class CC_E(a: T_B[Int]) extends T_B[CC_B[CC_A[Byte]]]

val v_a: T_A[T_B[T_A[Boolean, Char]], CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _), CC_D(), CC_C(_, _, _)) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_C(_, _, CC_C(_, _, _)), _, _) => 2 
}
}