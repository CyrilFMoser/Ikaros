package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[B]
case class CC_B[D]() extends T_B[D]
case class CC_C[E](a: T_A, b: T_B[E]) extends T_B[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_C Int
//      T_A
//      Int
//      (Tuple (CC_B Wildcard T_A) (CC_B Boolean T_A))
//      Byte
//      (T_B T_A Int))