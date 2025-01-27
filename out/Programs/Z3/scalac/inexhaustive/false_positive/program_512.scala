package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (CC_A,T_A), b: T_B[T_A, (Int,Char)]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,CC_C()), _) => 1 
  case CC_C() => 2 
}
}
// This is not matched: (CC_B T_A)