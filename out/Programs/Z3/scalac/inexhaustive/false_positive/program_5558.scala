package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Char, C]
case class CC_B[D](a: T_A[Char, D], b: Char) extends T_A[Char, D]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
}
}
// This is not matched: (CC_B Wildcard
//      (CC_D Boolean Boolean Byte Wildcard Wildcard (T_B Boolean Boolean))
//      (T_A (CC_A Char Boolean Boolean) (T_A Char Byte)))