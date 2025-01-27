package Program_16 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[(Boolean,Int)]], b: T_A[Char]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: (Byte,T_A[(Boolean,Char)])) extends T_A[T_A[T_A[Byte]]]
case class CC_C[B]() extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(CC_A(_, _), _)