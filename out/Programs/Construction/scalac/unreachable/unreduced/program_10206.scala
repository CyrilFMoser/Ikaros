package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, Char]
case class CC_B[E](a: T_A[E, (Boolean,Int)], b: (T_A[Char, Char],CC_A[Int]), c: T_B[E]) extends T_A[E, Char]
case class CC_C[F](a: CC_B[F]) extends T_B[F]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_)) => 0 
  case CC_B(_, (CC_B(_, _, _),CC_A(_)), CC_C(CC_B(_, _, _))) => 1 
}
}
// This is not matched: CC_B(_, (CC_A(_),CC_A(_)), CC_C(CC_B(_, _, _)))