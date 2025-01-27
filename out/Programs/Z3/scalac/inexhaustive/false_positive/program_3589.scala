package Program_13 

object Test {
sealed trait T_B[C]
case class CC_B[E](a: T_B[E]) extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_C()) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte Wildcard Wildcard (T_B Byte))
//      (CC_C Char (CC_C Char Wildcard (T_B Char)) (T_B Char))
//      (T_B Byte))