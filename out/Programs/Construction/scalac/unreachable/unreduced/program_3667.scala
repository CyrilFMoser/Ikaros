package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_A[D, D]) extends T_A[D, E]
case class CC_B[G, F](a: G, b: T_B[F]) extends T_A[G, F]
case class CC_C(a: T_A[CC_B[Char, Char], T_A[Boolean, Int]], b: T_A[T_B[Boolean], T_B[Boolean]], c: CC_A[T_A[Boolean, Byte], Byte]) extends T_B[CC_A[Int, T_A[Char, Byte]]]
case class CC_D(a: CC_B[Char, CC_C], b: T_A[(CC_C,CC_C), T_A[CC_C, CC_C]]) extends T_B[CC_A[Int, T_A[Char, Byte]]]
case class CC_E(a: CC_D, b: Char, c: Int) extends T_B[CC_A[Int, T_A[Char, Byte]]]

val v_a: T_B[CC_A[Int, T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_B(_, _), CC_A(CC_B(_, _))) => 1 
  case CC_D(CC_B(_, _), CC_B((_,_), _)) => 2 
  case CC_E(CC_D(_, CC_A(_)), _, 12) => 3 
  case CC_E(CC_D(_, CC_B(_, _)), _, 12) => 4 
  case CC_E(CC_D(_, CC_A(_)), _, _) => 5 
  case CC_E(CC_D(_, CC_B(_, _)), _, _) => 6 
}
}
// This is not matched: CC_D(CC_B(_, _), CC_A(CC_A(_)))