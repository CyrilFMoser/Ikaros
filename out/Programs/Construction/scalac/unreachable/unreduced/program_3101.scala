package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[Char, E], b: T_B[E, E], c: E) extends T_A[Char, E]
case class CC_B(a: Char, b: (T_A[Boolean, Byte],(Char,Byte)), c: T_A[Char, T_A[Char, Char]]) extends T_A[Char, T_B[T_B[Char, Byte], Byte]]

val v_a: CC_A[T_A[Char, T_B[T_B[Char, Byte], Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(_, _, CC_A(CC_B(_, _, _), _, _)) => 1 
  case CC_A(_, _, CC_B(_, (_,_), CC_A(_, _, _))) => 2 
}
}