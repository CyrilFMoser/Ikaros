package Program_14 

object Test {
sealed trait T_B[A, B]
case class CC_B[C](a: T_B[(Char,Int), C], b: C) extends T_B[C, T_B[C, C]]

val v_a: T_B[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)