package Program_31 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: Int) extends T_A[(Boolean,Char)]

val v_a: T_A[(Boolean,Char)] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (Tuple Boolean Char)))