package Program_15 

object Test {
sealed trait T_B[A]
case class CC_C[B](a: B) extends T_B[B]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Char (T_A Char))