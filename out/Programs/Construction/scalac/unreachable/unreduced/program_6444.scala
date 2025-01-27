package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]], c: (Boolean,T_A[Byte, (Boolean,Int)])) extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], C]
case class CC_B[D](a: ((Boolean,Char),Boolean), b: Byte) extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], D]
case class CC_C[E]() extends T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], E]

val v_a: T_A[T_A[T_A[Boolean, Int], T_A[Byte, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()