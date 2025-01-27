package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[T_A[(Byte,Byte), (Byte,Byte)], T_A[Byte, Boolean]], C]
case class CC_B[D, E]() extends T_A[T_A[T_A[(Byte,Byte), (Byte,Byte)], T_A[Byte, Boolean]], D]
case class CC_C[F](a: T_A[F, CC_A[F]]) extends T_A[T_A[T_A[(Byte,Byte), (Byte,Byte)], T_A[Byte, Boolean]], F]

val v_a: T_A[T_A[T_A[(Byte,Byte), (Byte,Byte)], T_A[Byte, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _)