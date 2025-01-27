package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D](a: T_A[D, E]) extends T_A[D, E]
case class CC_C[I, H]() extends T_A[H, I]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
}
}
// This is not matched: (CC_B Byte
//      (CC_B Byte Wildcard Byte Byte (T_A Byte))
//      Wildcard
//      Wildcard
//      (T_A Byte))