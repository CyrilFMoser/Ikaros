package Program_15 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Int, b: T_B[T_A], c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_D[C](a: C, b: CC_A) extends T_B[C]
case class CC_E[D, E](a: Byte, b: CC_A) extends T_B[D]

val v_a: T_B[CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_), _) => 1 
  case CC_D(CC_B(_), CC_A(_, _, _)) => 2 
  case CC_E(0, CC_A(_, _, _)) => 3 
  case CC_E(_, _) => 4 
}
}
// This is not matched: (CC_E (CC_B T_A T_A)
//      T_A
//      Wildcard
//      (CC_A Int (CC_C T_A (T_B T_A)) (CC_B Wildcard T_A) T_A)
//      (T_B (CC_B T_A T_A)))
// This is not matched: (CC_C Wildcard Wildcard Boolean T_A)