package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Byte, b: T_B[T_B[Boolean]]) extends T_A
case class CC_B(a: T_B[T_B[CC_A]], b: T_A, c: T_B[T_B[CC_A]]) extends T_A
case class CC_C(a: CC_A, b: T_B[(T_A,CC_B)], c: T_B[(T_A,CC_B)]) extends T_B[(T_A,CC_B)]
case class CC_D(a: (T_A,Boolean), b: T_B[(T_A,CC_B)]) extends T_B[(T_A,CC_B)]

val v_a: T_B[(T_A,CC_B)] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _, _) => 0 
  case CC_D((_,_), CC_C(_, _, _)) => 1 
  case CC_D((_,_), CC_D(_, _)) => 2 
}
}