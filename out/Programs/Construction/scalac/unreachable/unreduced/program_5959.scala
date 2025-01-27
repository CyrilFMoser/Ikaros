package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: T_B[CC_A], c: T_A) extends T_B[(T_A,CC_A)]
case class CC_C(a: CC_A, b: T_B[(T_A,CC_A)]) extends T_B[(T_A,CC_A)]

val v_a: T_B[(T_A,CC_A)] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_)) => 0 
  case CC_C(CC_A(CC_A(_)), CC_B(_, _, CC_A(_))) => 1 
  case CC_C(CC_A(CC_A(_)), CC_C(CC_A(_), CC_B(_, _, _))) => 2 
  case CC_C(CC_A(CC_A(_)), CC_C(CC_A(_), CC_C(_, _))) => 3 
}
}