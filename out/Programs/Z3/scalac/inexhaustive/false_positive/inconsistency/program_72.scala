package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[C]() extends T_B[C, (CC_C,CC_C)]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (T_A Byte))