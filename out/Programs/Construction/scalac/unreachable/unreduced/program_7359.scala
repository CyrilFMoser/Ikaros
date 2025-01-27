package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_B[(Boolean,Byte), Char], T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_A, CC_B], b: T_A) extends T_A
case class CC_D[C](a: T_B[(Char,Int), CC_A], b: C) extends T_B[C, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(CC_A(_, _), _)) => 2 
  case CC_C(_, CC_A(CC_B(), _)) => 3 
  case CC_C(_, CC_A(CC_C(_, _), _)) => 4 
  case CC_C(_, CC_B()) => 5 
  case CC_C(_, CC_C(_, _)) => 6 
}
}