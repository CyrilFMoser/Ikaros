package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, T_A],T_A)) extends T_A
case class CC_B(a: Byte, b: Int, c: Char) extends T_A
case class CC_C(a: T_A, b: Byte) extends T_A
case class CC_D(a: (CC_C,CC_B), b: CC_C) extends T_B[(T_A,(T_A,CC_B)), CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,CC_A(_))) => 0 
  case CC_A((_,CC_B(_, _, _))) => 1 
  case CC_A((_,CC_C(_, _))) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_A((_,_)), _) => 4 
  case CC_C(CC_B(_, _, _), _) => 5 
  case CC_C(CC_C(_, _), _) => 6 
}
}