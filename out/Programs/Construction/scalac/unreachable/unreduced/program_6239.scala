package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[(Char,Int)]]
case class CC_B(a: T_B[T_A[CC_A]]) extends T_A[T_A[(Char,Int)]]
case class CC_C(a: (CC_B,CC_B), b: T_A[Byte], c: T_B[Byte]) extends T_A[T_A[(Char,Int)]]

val v_a: T_A[T_A[(Char,Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)