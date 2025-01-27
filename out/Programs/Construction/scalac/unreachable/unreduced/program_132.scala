package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, Int],T_A), b: (T_B[T_A, T_A],Byte)) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_A, T_B[CC_A, T_A]]
case class CC_E(a: Char, b: CC_D, c: (T_B[CC_C, CC_C],Int)) extends T_B[T_A, T_B[CC_A, T_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()