package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Byte,Char)]]
case class CC_B(a: Int, b: T_A[CC_A]) extends T_A[T_A[(Byte,Char)]]

val v_a: T_A[T_A[(Byte,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(12, _) => 1 
}
}
// This is not matched: (CC_C Int Char Wildcard (T_A Int Boolean))