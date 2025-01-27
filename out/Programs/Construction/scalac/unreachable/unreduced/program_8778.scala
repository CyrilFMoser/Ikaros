package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[T_B[(Boolean,Boolean)]], D]
case class CC_B(a: T_B[CC_A[Byte]]) extends T_A[T_B[T_B[(Boolean,Boolean)]], CC_A[T_A[Int, Boolean]]]
case class CC_C[E](a: (CC_B,T_B[CC_B]), b: T_A[E, E]) extends T_B[E]
case class CC_D[F](a: CC_B, b: CC_B, c: T_B[F]) extends T_B[F]
case class CC_E(a: T_B[CC_B]) extends T_B[CC_B]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C((CC_B(_),CC_C(_, _)), _) => 0 
  case CC_C((CC_B(_),CC_D(_, _, _)), _) => 1 
  case CC_C((CC_B(_),CC_E(_)), _) => 2 
  case CC_D(_, _, _) => 3 
}
}