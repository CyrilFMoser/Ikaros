package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: C) extends T_A[(Char,Boolean), C]
case class CC_B() extends T_A[(Char,Boolean), CC_A[Boolean]]

val v_a: CC_A[T_A[(Char,Boolean), CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)