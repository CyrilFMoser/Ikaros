package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: D) extends T_A[D]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (T_A (T_A Boolean Byte) (CC_A Char Boolean Boolean Boolean)))