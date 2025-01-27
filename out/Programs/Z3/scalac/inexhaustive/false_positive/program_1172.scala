package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: (Char,Int)) extends T_A[D]
case class CC_D() extends T_B[Byte, Boolean]

val v_a: CC_A[CC_D] = null
val v_b: Int = v_a match{
  case CC_A(('x',_)) => 0 
}
}
// This is not matched: (CC_C Int (CC_B Int Wildcard (T_B Int Boolean)) (T_B Int Boolean))