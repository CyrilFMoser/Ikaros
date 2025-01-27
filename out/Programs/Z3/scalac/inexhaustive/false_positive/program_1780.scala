package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: D) extends T_A[(T_B,Byte), D]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_D Char
//      Wildcard
//      Wildcard
//      (T_B Char (T_A (CC_B Boolean Boolean) (CC_A Boolean))))