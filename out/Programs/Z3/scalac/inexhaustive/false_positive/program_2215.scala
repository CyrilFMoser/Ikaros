package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: CC_B) extends T_A
case class CC_D[C, D, E](a: T_A, b: CC_C) extends T_B[C, D]
case class CC_E[G, F](a: CC_B) extends T_B[G, F]

val v_a: T_B[Byte, CC_C] = null
val v_b: Int = v_a match{
  case CC_E(CC_B()) => 0 
  case CC_E(_) => 1 
  case CC_D(_, CC_C(_)) => 2 
  case CC_D(CC_A(_), _) => 3 
}
}
// This is not matched: (CC_D Byte
//      (CC_C T_A T_A)
//      T_A
//      Wildcard
//      (CC_C (CC_B T_A) T_A)
//      (T_B Byte (CC_C T_A T_A)))
// This is not matched: Pattern match is empty without constants