package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[(Boolean,Byte)]
case class CC_B[B](a: T_A[B], b: CC_A, c: B) extends T_A[B]

val v_a: CC_B[T_A[(Boolean,Byte)]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
}
}
// This is not matched: (CC_A Char (T_A Char))