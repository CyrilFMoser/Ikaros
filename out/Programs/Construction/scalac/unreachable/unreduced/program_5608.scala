package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D, c: (T_A[Char],T_A[Boolean])) extends T_A[D]
case class CC_B[E, F](a: Byte, b: T_A[E], c: Char) extends T_A[E]
case class CC_C[G](a: G, b: CC_A[CC_B[G, G]]) extends T_B[G, T_A[Char]]
case class CC_D[H](a: CC_B[H, H], b: CC_C[H]) extends T_B[Char, T_A[Char]]
case class CC_E(a: T_B[T_A[Boolean], T_A[Int]]) extends T_B[Char, T_A[Char]]

val v_a: T_B[Char, T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_A(CC_A(_, _, _), CC_B(_, _, _), _)) => 0 
  case CC_C(_, CC_A(CC_A(_, _, _), CC_B(_, _, _), _)) => 1 
  case CC_C('x', CC_A(CC_B(_, _, _), CC_B(_, _, _), _)) => 2 
  case CC_C(_, CC_A(CC_B(_, _, _), CC_B(_, _, _), _)) => 3 
  case CC_D(_, _) => 4 
  case CC_E(_) => 5 
}
}