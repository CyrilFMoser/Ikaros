package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Char, Byte], T_A[Char, Byte]], b: T_B[Int, T_B[Byte, Boolean]], c: Char) extends T_A[T_A[T_A[Boolean, Boolean], Boolean], T_A[T_B[Byte, Byte], T_A[(Char,Char), Int]]]
case class CC_B(a: CC_A, b: Char) extends T_A[T_A[T_A[Boolean, Boolean], Boolean], T_A[T_B[Byte, Byte], T_A[(Char,Char), Int]]]
case class CC_C(a: Char, b: CC_B, c: CC_B) extends T_A[T_A[T_A[Boolean, Boolean], Boolean], T_A[T_B[Byte, Byte], T_A[(Char,Char), Int]]]
case class CC_D[E]() extends T_B[CC_A, E]
case class CC_E[F](a: CC_C) extends T_B[CC_A, F]

val v_a: T_A[T_A[T_A[Boolean, Boolean], Boolean], T_A[T_B[Byte, Byte], T_A[(Char,Char), Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, _, _) => 1 
  case CC_C('x', _, CC_B(_, _)) => 2 
  case CC_C(_, _, CC_B(_, _)) => 3 
}
}
// This is not matched: CC_B(_, _)