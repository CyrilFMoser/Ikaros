package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: T_A[C, C]) extends T_A[T_A[T_A[Boolean, (Int,Char)], T_A[Boolean, Boolean]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Boolean, (Int,Char)], T_A[Boolean, Boolean]], D]
case class CC_C[E](a: E, b: E, c: Byte) extends T_A[T_A[T_A[Boolean, (Int,Char)], T_A[Boolean, Boolean]], E]

val v_a: T_A[T_A[T_A[Boolean, (Int,Char)], T_A[Boolean, Boolean]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}