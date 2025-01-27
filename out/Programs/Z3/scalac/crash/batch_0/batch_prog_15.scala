package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[D, C]() extends T_B[C, D]
case class CC_C[E, F]() extends T_B[E, F]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: (CC_C Byte Byte (T_B Byte Byte))