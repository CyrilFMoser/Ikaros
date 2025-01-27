package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[(Boolean,Byte), T_B[(Boolean,Byte), (Boolean,Byte)]], c: E) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: F, b: T_A[F, Char]) extends T_A[F, T_B[F, F]]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_A(_, CC_B((_,_), _), _)