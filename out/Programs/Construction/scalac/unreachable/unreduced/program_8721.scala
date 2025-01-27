package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[D, T_B[T_B[Boolean]]]
case class CC_B[E]() extends T_A[E, T_B[T_B[Boolean]]]
case class CC_C[F](a: CC_A[F], b: CC_A[F]) extends T_A[F, T_A[CC_A[Int], Byte]]
case class CC_D() extends T_B[CC_C[CC_C[Char]]]
case class CC_E(a: T_B[T_A[CC_D, (Int,Boolean)]], b: CC_C[T_B[Boolean]]) extends T_B[CC_C[CC_C[Char]]]

val v_a: T_B[CC_C[CC_C[Char]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, CC_C(_, _)) => 1 
}
}