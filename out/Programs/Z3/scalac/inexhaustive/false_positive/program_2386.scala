package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Boolean,Int)], b: (Boolean,Char)) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,'x')) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)