package Program_17 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_B[T_B[T_A, T_A], Byte]) extends T_A
case class CC_D() extends T_B[Char, ((T_A,CC_C),T_B[CC_C, Int])]
case class CC_E(a: CC_A, b: CC_B, c: Char) extends T_B[Char, ((T_A,CC_C),T_B[CC_C, Int])]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
  case CC_A(CC_B(), _) => 1 
  case CC_A(CC_C(CC_A(_, _), _), _) => 2 
  case CC_A(CC_C(CC_B(), _), _) => 3 
  case CC_A(CC_C(CC_C(_, _), _), _) => 4 
  case CC_B() => 5 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), _) => 6 
  case CC_C(CC_A(CC_B(), CC_A(_, _)), _) => 7 
  case CC_C(CC_A(CC_C(_, _), CC_A(_, _)), _) => 8 
  case CC_C(CC_A(CC_A(_, _), CC_B()), _) => 9 
  case CC_C(CC_A(CC_B(), CC_B()), _) => 10 
  case CC_C(CC_A(CC_C(_, _), CC_B()), _) => 11 
  case CC_C(CC_A(CC_A(_, _), CC_C(_, _)), _) => 12 
  case CC_C(CC_A(CC_B(), CC_C(_, _)), _) => 13 
  case CC_C(CC_A(CC_C(_, _), CC_C(_, _)), _) => 14 
  case CC_C(CC_B(), _) => 15 
  case CC_C(CC_C(_, _), _) => 16 
}
}