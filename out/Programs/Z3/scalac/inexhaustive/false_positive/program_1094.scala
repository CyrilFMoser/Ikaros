package Program_31 

object Test {
sealed trait T_A[A]
case class CC_B(a: Int) extends T_A[Int]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(12) => 0 
}
}
// This is not matched: (CC_B Byte Wildcard (T_A Byte))