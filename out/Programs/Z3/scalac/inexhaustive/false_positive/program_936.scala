package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[T_A[(Boolean,Int), (Byte,Char)], C]

val v_a: T_A[T_A[(Boolean,Int), (Byte,Char)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_C (CC_C Wildcard T_A) T_A)