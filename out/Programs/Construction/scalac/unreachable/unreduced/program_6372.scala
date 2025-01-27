package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: ((Byte,Int),Boolean), b: Byte) extends T_A[E, (T_B[Byte, Boolean],T_A[Int, Char])]
case class CC_B(a: CC_A[Char]) extends T_A[CC_A[Byte], (T_B[Byte, Boolean],T_A[Int, Char])]
case class CC_C(a: T_A[CC_A[CC_B], Boolean]) extends T_A[CC_A[Byte], (T_B[Byte, Boolean],T_A[Int, Char])]

val v_a: T_A[CC_A[Byte], (T_B[Byte, Boolean],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(CC_A(_, _))