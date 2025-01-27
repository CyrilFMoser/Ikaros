package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: (T_B[T_A, (Int,Byte)],Boolean), b: T_A, c: T_B[T_B[T_A, T_A], T_B[Int, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Int, c: T_B[T_A, T_B[CC_B, T_A]]) extends T_A
case class CC_D[C](a: T_A, b: Int) extends T_B[C, T_B[C, C]]
case class CC_E(a: T_A, b: Boolean, c: Char) extends T_B[Byte, T_B[Byte, Byte]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, _), 12, _) => 2 
  case CC_C(CC_A(_, _, _), _, _) => 3 
  case CC_C(CC_B(), 12, _) => 4 
  case CC_C(CC_B(), _, _) => 5 
  case CC_C(CC_C(_, _, _), 12, _) => 6 
  case CC_C(CC_C(_, _, _), _, _) => 7 
}
}