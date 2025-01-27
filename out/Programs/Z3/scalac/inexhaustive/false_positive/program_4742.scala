package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E](a: Byte) extends T_A[E, F]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (T_A (T_A Boolean Int) (CC_A Byte Char Boolean Boolean Boolean Boolean)))