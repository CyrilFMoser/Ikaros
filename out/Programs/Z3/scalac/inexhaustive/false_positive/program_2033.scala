package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: (Int,Byte), b: T_A[D, D]) extends T_A[D, CC_A[D]]

val v_a: T_A[Boolean, CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B((_,0), _) => 0 
}
}
// This is not matched: (CC_B T_B)