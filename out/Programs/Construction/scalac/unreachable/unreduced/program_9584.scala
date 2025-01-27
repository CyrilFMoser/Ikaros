package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Char, T_A], (T_A,Boolean)], b: Char) extends T_A
case class CC_B[C](a: Boolean, b: T_B[Boolean, C], c: Int) extends T_B[Boolean, C]
case class CC_C[D](a: Boolean, b: T_B[Boolean, D]) extends T_B[Boolean, D]
case class CC_D[E](a: CC_A, b: T_B[Boolean, E]) extends T_B[Boolean, E]

val v_a: T_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_B(true, CC_B(_, _, _), _)) => 1 
  case CC_C(_, CC_B(false, CC_B(_, _, _), _)) => 2 
  case CC_C(_, CC_B(true, CC_C(_, _), _)) => 3 
  case CC_C(_, CC_B(false, CC_C(_, _), _)) => 4 
  case CC_C(_, CC_B(true, CC_D(_, _), _)) => 5 
  case CC_C(_, CC_B(false, CC_D(_, _), _)) => 6 
  case CC_C(_, CC_C(_, _)) => 7 
  case CC_C(_, CC_D(CC_A(_, _), CC_C(_, _))) => 8 
  case CC_C(_, CC_D(CC_A(_, _), CC_D(_, _))) => 9 
  case CC_D(CC_A(_, _), CC_B(true, CC_B(_, _, _), _)) => 10 
  case CC_D(CC_A(_, _), CC_B(false, CC_B(_, _, _), _)) => 11 
  case CC_D(CC_A(_, _), CC_B(true, CC_C(_, _), _)) => 12 
  case CC_D(CC_A(_, _), CC_B(false, CC_C(_, _), _)) => 13 
  case CC_D(CC_A(_, _), CC_B(true, CC_D(_, _), _)) => 14 
  case CC_D(CC_A(_, _), CC_B(false, CC_D(_, _), _)) => 15 
  case CC_D(CC_A(_, _), CC_C(_, _)) => 16 
  case CC_D(CC_A(_, _), CC_D(CC_A(_, _), _)) => 17 
}
}
// This is not matched: CC_C(_, CC_D(CC_A(_, _), CC_B(_, _, _)))