package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[Int, D], c: T_B[D]) extends T_A[Int, D]
case class CC_B(a: CC_A[T_A[Int, Char]], b: Byte, c: Byte) extends T_A[Int, CC_A[(Byte,Byte)]]
case class CC_C[E](a: T_A[Int, E], b: T_A[E, T_A[Int, E]]) extends T_A[Int, E]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: (CC_D[CC_B],T_A[Int, CC_B]), b: (CC_C[CC_B],CC_D[CC_B])) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E((CC_D(),CC_C(_, _)), (CC_C(_, _),CC_D())) => 1 
}
}
// This is not matched: CC_E((CC_D(),CC_A(_, _, _)), (CC_C(_, _),CC_D()))