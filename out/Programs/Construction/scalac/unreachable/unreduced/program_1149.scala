package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_B[D]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], D]
case class CC_B(a: T_A[Byte, T_B[Boolean]], b: T_B[CC_A[Boolean]], c: CC_A[CC_A[Boolean]]) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], T_B[T_A[Int, Char]]]
case class CC_C(a: (T_B[Int],(CC_B,CC_B))) extends T_A[T_A[T_A[Byte, Char], T_A[Char, Byte]], T_B[T_A[Int, Char]]]
case class CC_D() extends T_B[CC_C]
case class CC_E[E](a: CC_B, b: E, c: T_B[E]) extends T_B[E]
case class CC_F[F](a: (CC_A[CC_B],T_B[Boolean])) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(_, _, _), CC_C(_), CC_D()) => 1 
  case CC_E(CC_B(_, _, _), CC_C(_), CC_E(_, _, _)) => 2 
  case CC_F(_) => 3 
}
}
// This is not matched: CC_E(CC_B(_, _, _), CC_C(_), CC_F(_))