package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Byte]) extends T_A[(Byte,Byte)]
case class CC_B[C]() extends T_B[C]
case class CC_D[D]() extends T_B[D]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (Tuple (CC_B Wildcard Wildcard (CC_A Int Wildcard Wildcard T_A) T_A) Int)
//      Wildcard
//      T_A)