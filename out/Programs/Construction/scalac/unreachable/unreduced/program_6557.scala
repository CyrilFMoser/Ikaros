package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Char, (Int,Char)], b: T_A[T_A[Char, (Char,Byte)], T_B[Byte, Boolean]]) extends T_A[T_A[T_A[(Char,Char), Byte], T_B[(Int,Byte), Char]], T_B[T_A[Byte, Byte], T_B[Boolean, Boolean]]]
case class CC_B(a: T_B[CC_A, T_B[CC_A, Char]]) extends T_A[T_A[T_A[(Char,Char), Byte], T_B[(Int,Byte), Char]], T_B[T_A[Byte, Byte], T_B[Boolean, Boolean]]]
case class CC_C[F, E](a: E) extends T_B[F, E]

val v_a: T_A[T_A[T_A[(Char,Char), Byte], T_B[(Int,Byte), Char]], T_B[T_A[Byte, Byte], T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_), _) => 0 
  case CC_B(CC_C(CC_C(_))) => 1 
}
}