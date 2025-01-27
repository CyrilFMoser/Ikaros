package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: D) extends T_A[D]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_A Char Wildcard (T_A Char (T_A (Tuple Int Char) Boolean)))
//      Wildcard
//      (T_A (CC_A Boolean Boolean Boolean) Byte))