package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_B[Char, T_B[Byte, (Boolean,Boolean)]]) extends T_A
case class CC_B[C]() extends T_B[T_A, C]
case class CC_C(a: T_B[(CC_A,T_A), T_A], b: T_B[T_A, T_A]) extends T_B[T_A, CC_B[T_B[CC_A, CC_A]]]
case class CC_D[D]() extends T_B[T_A, D]

val v_a: T_B[T_A, CC_B[T_B[CC_A, CC_A]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_D()