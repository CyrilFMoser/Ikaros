package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Boolean,Byte)]]
case class CC_B(a: Int, b: T_A[T_A[Char]]) extends T_A[T_A[(Boolean,Byte)]]
case class CC_C(a: (CC_B,CC_A), b: CC_B, c: CC_A) extends T_A[T_A[(Boolean,Byte)]]

val v_a: T_A[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C((CC_B(_, _),CC_A()), CC_B(12, _), _) => 2 
  case CC_C((CC_B(_, _),CC_A()), CC_B(_, _), _) => 3 
}
}