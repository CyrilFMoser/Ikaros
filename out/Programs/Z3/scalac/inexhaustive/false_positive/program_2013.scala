package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[E, F]() extends T_A[E, F]
case class CC_D(a: Byte) extends T_B[CC_B[Int, Int]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants