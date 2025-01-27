package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[D]]
case class CC_B(a: (Int,Int)) extends T_A[CC_A[Byte], T_B[CC_A[Byte]]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants