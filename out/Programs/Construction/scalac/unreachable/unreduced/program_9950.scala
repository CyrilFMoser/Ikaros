package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[D, T_A[Int, D]]]
case class CC_B[E]() extends T_A[E, T_A[E, T_A[Int, E]]]
case class CC_C[F](a: T_A[F, F]) extends T_A[F, T_A[F, T_A[Int, F]]]
case class CC_D(a: CC_A[(Boolean,Char)], b: CC_B[Boolean]) extends T_B[CC_A[CC_B[Byte]]]

val v_a: T_A[Int, T_A[Int, T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()