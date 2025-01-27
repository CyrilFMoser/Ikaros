package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, E], b: T_B[E], c: Byte) extends T_A[D, E]
case class CC_B[F, G](a: T_A[G, F]) extends T_A[F, G]
case class CC_C[H](a: T_A[H, Char], b: CC_A[H, H], c: CC_A[H, CC_B[H, H]]) extends T_A[H, Char]
case class CC_D(a: T_B[Int], b: CC_A[T_A[Byte, Char], T_B[Char]]) extends T_B[Int]
case class CC_E(a: Int) extends T_B[Int]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(CC_A(_, _, _)), _, _) => 1 
  case CC_A(CC_B(CC_B(_)), _, _) => 2 
  case CC_A(CC_C(_, _, _), _, _) => 3 
  case CC_B(_) => 4 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 5 
  case CC_C(CC_B(CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 6 
  case CC_C(CC_B(CC_B(_)), CC_A(_, _, _), CC_A(_, _, _)) => 7 
  case CC_C(CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 8 
  case CC_C(CC_C(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 9 
  case CC_C(CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 10 
}
}