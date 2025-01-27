package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[Char, Char], b: Byte) extends T_A[C, D]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_C() extends T_A[T_A[Byte, Char], T_A[Boolean, Boolean]]

val v_a: CC_A[CC_C, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_C T_B)