package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, Int], b: Char) extends T_A[D]
case class CC_B() extends T_B[Char, T_A[Int]]

val v_a: T_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x') => 0 
}
}
// This is not matched: (CC_A Byte Wildcard (T_A Byte))