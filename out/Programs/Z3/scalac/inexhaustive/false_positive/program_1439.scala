package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[C, T_A[C, C]]
case class CC_C() extends T_A[T_A[Byte, Int], T_A[T_A[Byte, Int], T_A[Byte, Int]]]

val v_a: T_A[CC_C, T_A[CC_C, CC_C]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: Pattern match is empty without constants