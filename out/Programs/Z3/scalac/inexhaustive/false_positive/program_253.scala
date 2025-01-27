package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[(Byte,Char), Char], Boolean]
case class CC_C() extends T_A[T_B[(Byte,Char), Char], Boolean]
case class CC_E(a: Int) extends T_B[T_A[CC_C, CC_A], CC_C]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants