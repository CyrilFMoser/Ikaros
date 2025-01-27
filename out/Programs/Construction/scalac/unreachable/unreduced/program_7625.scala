package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, Boolean], T_A], b: Boolean) extends T_A
case class CC_B[C](a: T_B[C, CC_A], b: C, c: Int) extends T_B[C, CC_A]
case class CC_C(a: Boolean, b: CC_B[T_B[(Char,Boolean), CC_A]], c: T_A) extends T_B[Byte, CC_A]
case class CC_D[D](a: T_B[D, CC_A], b: D, c: CC_A) extends T_B[D, CC_A]

val v_a: T_B[Byte, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, _) => 1 
  case CC_B(CC_B(CC_D(_, _, _), _, _), _, _) => 2 
  case CC_B(CC_C(_, _, _), _, _) => 3 
  case CC_B(CC_D(_, _, _), _, _) => 4 
  case CC_C(_, CC_B(CC_B(_, _, _), _, 12), _) => 5 
  case CC_C(_, CC_B(CC_B(_, _, _), _, _), _) => 6 
  case CC_C(_, CC_B(CC_D(_, _, _), _, 12), _) => 7 
  case CC_C(_, CC_B(CC_D(_, _, _), _, _), _) => 8 
  case CC_D(_, _, CC_A(_, _)) => 9 
}
}