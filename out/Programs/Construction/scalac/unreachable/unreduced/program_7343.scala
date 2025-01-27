package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_A[(Char,Byte), Char], T_A[Boolean, (Int,Byte)]], C]
case class CC_B[D]() extends T_A[T_A[T_A[(Char,Byte), Char], T_A[Boolean, (Int,Byte)]], D]
case class CC_C[E](a: CC_B[T_A[E, E]], b: T_A[E, E], c: CC_A[E]) extends T_A[T_A[T_A[(Char,Byte), Char], T_A[Boolean, (Int,Byte)]], E]

val v_a: T_A[T_A[T_A[(Char,Byte), Char], T_A[Boolean, (Int,Byte)]], Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)