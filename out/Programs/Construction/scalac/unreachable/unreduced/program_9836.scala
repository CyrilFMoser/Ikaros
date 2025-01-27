package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Char]) extends T_A[Boolean]
case class CC_B[D](a: T_A[Boolean]) extends T_B[D, T_B[(CC_A,CC_A), T_A[CC_A]]]
case class CC_C[E]() extends T_B[E, T_A[E]]
case class CC_D[G, F](a: T_A[G], b: T_A[G]) extends T_B[G, F]

val v_a: T_B[Boolean, T_B[(CC_A,CC_A), T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_D(_, _) => 1 
}
}