package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[(Char,Char)]]
case class CC_B(a: (Boolean,(CC_A,CC_A)), b: Byte, c: T_A[CC_A]) extends T_A[T_A[(Char,Char)]]

val v_a: T_A[T_A[(Char,Char)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,(_,_)), _, _) => 1 
}
}