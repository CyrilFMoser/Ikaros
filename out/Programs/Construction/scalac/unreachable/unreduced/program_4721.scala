package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Byte, b: T_A[E, F]) extends T_A[F, E]
case class CC_B[G, H](a: T_A[G, G], b: T_A[(Boolean,Int), G], c: T_B[H, H]) extends T_A[H, G]
case class CC_C[I](a: CC_B[I, I], b: CC_B[I, I]) extends T_A[(T_A[Boolean, Boolean],(Boolean,Int)), I]
case class CC_D(a: Byte, b: T_A[((Byte,Int),Char), T_A[Boolean, Char]]) extends T_B[T_A[CC_B[Boolean, Byte], Char], (T_A[Char, Int],CC_A[Byte, Char])]
case class CC_E(a: (T_A[Byte, CC_D],CC_D), b: CC_A[CC_A[CC_D, (Int,Int)], CC_A[Byte, CC_D]], c: T_A[(Char,CC_D), CC_C[CC_D]]) extends T_B[T_A[CC_B[Boolean, Byte], Char], (T_A[Char, Int],CC_A[Byte, Char])]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E((CC_A(_, _),CC_D(_, _)), CC_A(_, _), CC_A(_, CC_A(_, _))) => 0 
  case CC_E((CC_A(_, _),CC_D(_, _)), CC_A(_, _), CC_A(_, CC_B(_, _, _))) => 1 
  case CC_E((CC_A(_, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_A(_, _), CC_A(_, _), _)) => 2 
  case CC_E((CC_A(_, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 3 
  case CC_E((CC_A(_, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_A(_, _), CC_B(_, _, _), _)) => 4 
  case CC_E((CC_A(_, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_B(_, _, _), CC_B(_, _, _), _)) => 5 
  case CC_E((CC_B(_, _, _),CC_D(_, _)), CC_A(_, _), CC_A(_, CC_A(_, _))) => 6 
  case CC_E((CC_B(_, _, _),CC_D(_, _)), CC_A(_, _), CC_A(_, CC_B(_, _, _))) => 7 
  case CC_E((CC_B(_, _, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_A(_, _), CC_A(_, _), _)) => 8 
  case CC_E((CC_B(_, _, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_B(_, _, _), CC_A(_, _), _)) => 9 
  case CC_E((CC_B(_, _, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_A(_, _), CC_B(_, _, _), _)) => 10 
  case CC_E((CC_B(_, _, _),CC_D(_, _)), CC_A(_, _), CC_B(CC_B(_, _, _), CC_B(_, _, _), _)) => 11 
}
}