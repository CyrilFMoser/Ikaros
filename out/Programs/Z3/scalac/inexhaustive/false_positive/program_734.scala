package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[C, D]
case class CC_B() extends T_A[Int]
case class CC_D[G, H](a: T_A[H], b: Int) extends T_B[G, H]

val v_a: T_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, 12) => 0 
}
}
// This is not matched: (CC_D Char Byte Wildcard Wildcard Int (T_B Char Byte))