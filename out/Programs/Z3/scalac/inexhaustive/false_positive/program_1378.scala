package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[B, C](a: C, b: CC_C, c: CC_B) extends T_B[B]
case class CC_E[D](a: CC_A) extends T_B[D]
case class CC_F[E]() extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_E(_) => 0 
  case CC_F() => 1 
  case CC_D(_, CC_C(), _) => 2 
  case CC_D(_, CC_C(), CC_B()) => 3 
}
}
// This is not matched: (CC_D Char T_A Wildcard Wildcard (CC_B T_A) (T_B Char))
// This is not matched: (CC_E Boolean Wildcard (T_B Char Boolean))