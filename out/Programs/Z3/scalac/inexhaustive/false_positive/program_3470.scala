package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_D(a: ((Char,Char),Byte)) extends T_B[T_A[Int, Boolean]]

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D((_,0)) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)