package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Char], b: Byte) extends T_A[(Byte,Int)]

val v_a: T_A[(Byte,Int)] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
}
}
// This is not matched: (CC_B (CC_A (CC_A Wildcard T_A) T_A) T_A)