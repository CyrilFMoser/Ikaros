package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_B() extends T_A[Int, T_B[Byte]]
case class CC_E(a: Byte) extends T_B[CC_A[CC_B, Char]]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants