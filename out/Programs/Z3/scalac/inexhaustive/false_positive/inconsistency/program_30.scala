package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_A]) extends T_A
case class CC_B() extends T_B[T_B[Byte]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants