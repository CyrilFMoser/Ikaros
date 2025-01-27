package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C[C](a: C, b: C) extends T_B[C, CC_B]
case class CC_D[D, E]() extends T_B[D, CC_B]

val v_a: T_B[CC_A, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_A()) => 0 
  case CC_D() => 1 
}
}
// This is not matched: (CC_D (CC_A (T_B T_A T_A))
//      T_A
//      (T_B (CC_A (T_B T_A T_A)) (CC_B (T_B T_A T_A) (T_B (T_B T_A T_A) T_A))))
// This is not matched: (CC_B Wildcard (T_A (Tuple Byte Boolean)))