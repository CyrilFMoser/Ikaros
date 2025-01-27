package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_B[(Boolean,Char), T_B[Int, Char]]]
case class CC_B[E, D]() extends T_B[D, E]
case class CC_C[F](a: T_A[F], b: Int, c: T_B[F, F]) extends T_B[CC_A, F]
case class CC_D[G](a: G, b: (T_B[CC_A, CC_A],T_A[Int])) extends T_B[CC_A, CC_C[CC_B[CC_A, Int]]]

val v_a: T_B[CC_A, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_B()) => 1 
}
}