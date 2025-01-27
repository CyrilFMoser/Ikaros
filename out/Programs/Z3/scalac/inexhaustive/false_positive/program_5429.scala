package Program_12 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[(Char,Char)]) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_B()) => 1 
  case CC_A(_) => 2 
}
}
// This is not matched: (CC_B Boolean Boolean (T_A Boolean))
// This is not matched: (CC_A T_A T_A)