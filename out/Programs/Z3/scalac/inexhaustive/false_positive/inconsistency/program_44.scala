package Program_30 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: (Byte,Int)) extends T_A[(Char,Char)]

val v_a: T_A[(Char,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,12)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)