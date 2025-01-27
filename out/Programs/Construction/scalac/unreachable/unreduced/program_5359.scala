package Program_18 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: (Int,T_B[T_A, CC_A]), b: Char, c: T_B[(CC_A,T_A), Int]) extends T_B[T_A, CC_A]
case class CC_C(a: (T_A,T_B[T_A, CC_A]), b: CC_A, c: Char) extends T_B[T_A, CC_A]
case class CC_D() extends T_B[T_A, CC_A]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_B((_,CC_B(_, _, _)), _, _) => 0 
  case CC_B((_,CC_C(_, _, _)), _, _) => 1 
  case CC_B((_,CC_D()), _, _) => 2 
  case CC_C((CC_A(),CC_B(_, _, _)), CC_A(), _) => 3 
  case CC_C((CC_A(),CC_C(_, _, _)), CC_A(), _) => 4 
  case CC_C((CC_A(),CC_D()), CC_A(), _) => 5 
  case CC_D() => 6 
}
}