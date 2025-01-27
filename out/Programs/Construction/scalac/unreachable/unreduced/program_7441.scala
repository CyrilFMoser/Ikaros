package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Byte]], b: T_A[Char], c: T_A[T_A[Byte]]) extends T_A[Char]
case class CC_B(a: T_A[(Char,CC_A)], b: Byte) extends T_A[Char]
case class CC_C(a: CC_B, b: T_A[Char]) extends T_A[CC_B]
case class CC_D[E, D](a: E, b: T_A[Char], c: CC_A) extends T_B[E, D]
case class CC_E[F](a: F, b: (T_A[Char],CC_B)) extends T_B[Byte, F]

val v_a: T_B[Byte, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, (CC_A(_, _, _),CC_B(_, _))) => 1 
}
}
// This is not matched: CC_E(_, (CC_B(_, _),CC_B(_, _)))