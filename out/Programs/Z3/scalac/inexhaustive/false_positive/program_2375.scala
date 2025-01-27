package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Char]
case class CC_B(a: (Byte,T_B), b: T_A[(Byte,Byte), T_B]) extends T_B
case class CC_C() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_C()), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: Pattern match is empty without constants