package Program_31 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[(Char,Boolean), C], b: C) extends T_A[Boolean, C]
case class CC_B[D]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_B T_B T_B)
// This is not matched: (CC_C T_A Byte Wildcard Wildcard Wildcard (T_B Byte T_A))