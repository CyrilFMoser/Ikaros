package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char) extends T_A[T_B[Boolean, Byte], E]
case class CC_B(a: T_A[T_B[Boolean, Byte], T_B[Boolean, Boolean]], b: T_A[T_B[Boolean, Byte], T_B[Boolean, Int]], c: T_A[T_B[Boolean, Byte], (Char,Byte)]) extends T_A[T_B[Boolean, Byte], T_A[T_B[Boolean, Byte], CC_A[Char]]]
case class CC_C[F](a: T_A[F, F], b: Char, c: T_A[T_B[Boolean, Byte], T_B[CC_B, Int]]) extends T_B[F, Int]
case class CC_D(a: Int, b: Char) extends T_B[CC_B, Int]
case class CC_E[G, H]() extends T_B[G, H]

val v_a: T_B[CC_B, Int] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_A(_)) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}