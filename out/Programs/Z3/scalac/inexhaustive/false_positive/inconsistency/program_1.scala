package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, (Char,Char)]]
case class CC_B() extends T_B
case class CC_C(a: T_A[CC_B, CC_B], b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
}
}
// This is not matched: (CC_B (T_A (CC_A Byte Byte Boolean Boolean Boolean)
//           (CC_A Char Char Boolean Boolean Boolean)))