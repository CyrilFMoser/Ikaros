package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Int]) extends T_A[(Boolean,Int)]

val v_a: T_A[(Boolean,Int)] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B Int Wildcard T_A) Wildcard T_A)