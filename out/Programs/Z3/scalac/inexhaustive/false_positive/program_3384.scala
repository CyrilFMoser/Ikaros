package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_C(a: Byte) extends T_A[CC_A[Boolean]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants