package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_C(a: T_A, b: T_B[Boolean, Char]) extends T_A
case class CC_E[D]() extends T_B[T_A, D]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), _) => 0 
}
}
// This is not matched: (CC_B Int
//      Byte
//      Wildcard
//      Wildcard
//      (CC_A Int Byte Wildcard (T_A Int Byte))
//      (T_A Byte Int))