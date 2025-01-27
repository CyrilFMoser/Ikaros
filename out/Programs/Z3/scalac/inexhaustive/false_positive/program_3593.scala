package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: (Int,T_B), b: T_A[D, C]) extends T_A[D, C]
case class CC_B() extends T_B
case class CC_C(a: Int, b: T_A[CC_B, T_B], c: CC_B) extends T_B
case class CC_D[E]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_B() => 1 
  case CC_C(12, _, CC_B()) => 2 
  case CC_C(_, CC_A(_, _), CC_B()) => 3 
  case CC_C(12, CC_A(_, _), _) => 4 
  case CC_C(12, _, _) => 5 
}
}
// This is not matched: (CC_D T_B T_B)
// This is not matched: (CC_D T_B T_B)