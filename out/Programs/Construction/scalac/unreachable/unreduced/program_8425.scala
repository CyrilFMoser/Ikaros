package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: Byte, b: T_A[E, T_A[E, E]], c: Byte) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_A[F, Char]], b: (T_B[Int],CC_B[(Char,Byte)])) extends T_A[F, T_A[F, F]]
case class CC_D[G](a: T_A[G, CC_B[G]]) extends T_B[G]
case class CC_E[H](a: H, b: Boolean, c: (CC_C[Int],CC_B[Boolean])) extends T_B[H]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, (CC_E(_, _, _),CC_B(_, _, _))) => 2 
}
}
// This is not matched: CC_C(_, (CC_D(_),CC_B(_, _, _)))