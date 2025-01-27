package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: Boolean, b: T_B) extends T_A[T_A[CC_A]]
case class CC_C(a: T_B, b: (CC_A,CC_B)) extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: Char) extends T_B
case class CC_E(a: CC_C, b: T_A[Char]) extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[T_A[T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_D(_), (CC_A(),CC_B(_, _))) => 1 
  case CC_C(CC_E(CC_C(_, _), _), (CC_A(),CC_B(_, _))) => 2 
  case CC_C(CC_F(), (CC_A(),CC_B(_, _))) => 3 
}
}