package Program_15 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B]() extends T_A
case class CC_C(a: CC_B[Char], b: CC_B[CC_A]) extends T_A
case class CC_D[C](a: C, b: T_B[C]) extends T_B[C]
case class CC_E[D](a: T_B[D], b: (Int,T_A)) extends T_B[D]
case class CC_F[E](a: T_B[E], b: T_B[E], c: E) extends T_B[E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
  case CC_C(CC_B(), CC_B()) => 3 
  case CC_C(CC_B(), _) => 4 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_D Byte Wildcard Wildcard (T_B Byte))