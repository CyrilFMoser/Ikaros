package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_A[(Char,Byte), T_A[(Int,Byte), Byte]], D]
case class CC_B[E](a: T_A[E, T_B[E]], b: T_B[E], c: E) extends T_A[CC_A[CC_A[Char]], E]
case class CC_C(a: Char) extends T_A[T_A[(Char,Byte), T_A[(Int,Byte), Byte]], T_B[CC_B[Byte]]]
case class CC_D[F](a: CC_B[F], b: CC_B[F], c: Boolean) extends T_B[F]
case class CC_E[G](a: Char, b: T_B[G], c: T_B[G]) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, CC_D(_, _, _), CC_D(_, CC_B(_, _, _), _)) => 1 
  case CC_E(_, CC_D(_, _, _), CC_E(_, CC_D(_, _, _), CC_D(_, _, _))) => 2 
  case CC_E(_, CC_D(_, _, _), CC_E(_, CC_D(_, _, _), CC_E(_, _, _))) => 3 
  case CC_E(_, CC_D(_, _, _), CC_E(_, CC_E(_, _, _), CC_D(_, _, _))) => 4 
  case CC_E(_, CC_D(_, _, _), CC_E(_, CC_E(_, _, _), CC_E(_, _, _))) => 5 
  case CC_E(_, CC_E(_, _, _), CC_D(_, CC_B(_, _, _), _)) => 6 
  case CC_E(_, CC_E(_, _, _), CC_E(_, CC_D(_, _, _), CC_E(_, _, _))) => 7 
  case CC_E(_, CC_E(_, _, _), CC_E(_, CC_E(_, _, _), CC_D(_, _, _))) => 8 
  case CC_E(_, CC_E(_, _, _), CC_E(_, CC_E(_, _, _), CC_E(_, _, _))) => 9 
}
}
// This is not matched: CC_E(_, CC_E(_, _, _), CC_E(_, CC_D(_, _, _), CC_D(_, _, _)))