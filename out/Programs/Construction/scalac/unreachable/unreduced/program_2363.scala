package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_A], b: Byte) extends T_A
case class CC_B[C]() extends T_B[CC_A, C]
case class CC_C(a: T_B[CC_A, (Byte,CC_A)], b: Byte, c: T_B[CC_A, Char]) extends T_B[CC_A, (Byte,CC_A)]
case class CC_D(a: CC_A) extends T_B[CC_A, (Byte,CC_A)]

val v_a: T_B[CC_A, (Byte,CC_A)] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_B(), _, CC_B()) => 1 
  case CC_C(CC_C(CC_B(), _, _), _, CC_B()) => 2 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, CC_B()) => 3 
  case CC_C(CC_C(CC_D(_), _, _), _, CC_B()) => 4 
  case CC_C(CC_D(_), _, CC_B()) => 5 
  case CC_D(CC_A(_, _)) => 6 
}
}