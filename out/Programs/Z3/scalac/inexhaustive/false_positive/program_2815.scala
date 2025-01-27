package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[Boolean, Char]]
case class CC_B() extends T_A[CC_A[Char], T_A[Boolean, Char]]

val v_a: CC_A[T_A[CC_A[Char], T_A[Boolean, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_A T_A)