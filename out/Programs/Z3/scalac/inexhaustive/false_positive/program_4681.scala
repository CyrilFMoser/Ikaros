package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[Boolean, (Byte,Int)], T_A[Char, Boolean]]
case class CC_B(a: T_A[CC_A, CC_A], b: Char) extends T_A[T_A[Boolean, (Byte,Int)], T_A[Char, Boolean]]

val v_a: T_A[T_A[Boolean, (Byte,Int)], T_A[Char, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, 'x') => 1 
}
}
// This is not matched: (CC_C (CC_B T_B Wildcard T_B) T_B)