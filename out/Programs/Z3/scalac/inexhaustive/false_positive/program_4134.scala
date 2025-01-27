package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Byte,(Byte,Int)), b: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)