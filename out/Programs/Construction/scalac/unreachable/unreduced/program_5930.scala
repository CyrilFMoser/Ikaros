package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_B[T_B[T_A]], c: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[(Char,CC_B)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()