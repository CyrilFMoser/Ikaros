package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Int], Byte], b: T_A[T_B[Boolean, Int]], c: T_B[T_B[Char, Boolean], T_B[Char, Char]]) extends T_A[T_B[T_B[Byte, Int], T_A[Byte]]]
case class CC_B[D, E](a: Boolean, b: Char, c: T_B[D, T_A[D]]) extends T_B[E, D]
case class CC_C[G, F](a: T_B[G, CC_A], b: CC_B[F, G], c: T_A[G]) extends T_B[G, F]
case class CC_D(a: T_A[Boolean], b: T_B[Int, Boolean]) extends T_B[Int, Boolean]

val v_a: T_B[Char, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(true, _, CC_B(_, _, _)) => 0 
  case CC_B(true, _, CC_C(CC_B(_, _, _), CC_B(_, _, _), _)) => 1 
  case CC_B(true, _, CC_C(CC_C(_, _, _), CC_B(_, _, _), _)) => 2 
  case CC_B(false, _, CC_B(_, _, _)) => 3 
  case CC_B(false, _, CC_C(CC_B(_, _, _), CC_B(_, _, _), _)) => 4 
  case CC_B(false, _, CC_C(CC_C(_, _, _), CC_B(_, _, _), _)) => 5 
  case CC_C(CC_B(_, _, _), _, _) => 6 
  case CC_C(CC_C(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 7 
  case CC_C(CC_C(CC_C(_, _, _), CC_B(_, _, _), _), _, _) => 8 
}
}