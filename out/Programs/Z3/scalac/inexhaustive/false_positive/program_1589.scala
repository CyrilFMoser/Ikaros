package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: (Int,Int)) extends T_A[(Int,Char)]

val v_a: T_A[(Int,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_C Wildcard Wildcard T_A) T_A)