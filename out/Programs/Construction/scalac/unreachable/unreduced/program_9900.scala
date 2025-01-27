package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char, b: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[E](a: E) extends T_A[E, CC_A[E]]
case class CC_C[F](a: (CC_A[Boolean],CC_A[Int]), b: T_A[F, F]) extends T_A[F, CC_A[F]]
case class CC_D[G](a: T_A[G, CC_A[G]], b: T_A[G, CC_A[G]]) extends T_B[G]

val v_a: T_A[Boolean, CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(true) => 0 
  case CC_B(false) => 1 
  case CC_C((CC_A(_, _),CC_A(_, _)), _) => 2 
}
}