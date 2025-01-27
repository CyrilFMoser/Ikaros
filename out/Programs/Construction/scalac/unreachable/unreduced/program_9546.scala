package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E], b: T_B[E, E], c: E) extends T_A[T_A[E, E], E]
case class CC_B[F](a: T_A[F, F]) extends T_B[F, (T_B[Byte, (Byte,Byte)],T_B[Boolean, Boolean])]
case class CC_C[G]() extends T_B[G, (T_B[Byte, (Byte,Byte)],T_B[Boolean, Boolean])]
case class CC_D(a: Int, b: T_A[CC_B[Boolean], Char]) extends T_B[T_A[T_A[T_B[Char, (Char,Byte)], T_B[Char, (Char,Byte)]], T_B[Char, (Char,Byte)]], (T_B[Byte, (Byte,Byte)],T_B[Boolean, Boolean])]

val v_a: T_B[T_A[T_A[T_B[Char, (Char,Byte)], T_B[Char, (Char,Byte)]], T_B[Char, (Char,Byte)]], (T_B[Byte, (Byte,Byte)],T_B[Boolean, Boolean])] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C() => 1 
  case CC_D(_, _) => 2 
}
}