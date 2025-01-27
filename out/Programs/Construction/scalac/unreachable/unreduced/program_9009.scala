package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B[C](a: T_B[T_A, CC_A], b: T_B[C, CC_A], c: T_B[C, C]) extends T_B[C, CC_A]
case class CC_C[D](a: T_B[D, CC_A]) extends T_B[D, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), CC_B(_, CC_B(_, _, _), _), _) => 0 
  case CC_B(CC_B(_, _, _), CC_B(_, CC_C(_), _), _) => 1 
  case CC_B(CC_B(_, _, _), CC_C(CC_B(_, _, _)), _) => 2 
  case CC_B(CC_B(_, _, _), CC_C(CC_C(_)), _) => 3 
  case CC_B(CC_C(_), CC_B(_, CC_B(_, _, _), _), _) => 4 
  case CC_B(CC_C(_), CC_B(_, CC_C(_), _), _) => 5 
  case CC_B(CC_C(_), CC_C(CC_B(_, _, _)), _) => 6 
  case CC_B(CC_C(_), CC_C(CC_C(_)), _) => 7 
  case CC_C(CC_B(CC_B(_, _, _), CC_B(_, _, _), _)) => 8 
  case CC_C(CC_B(CC_C(_), CC_B(_, _, _), _)) => 9 
  case CC_C(CC_B(CC_B(_, _, _), CC_C(_), _)) => 10 
  case CC_C(CC_B(CC_C(_), CC_C(_), _)) => 11 
  case CC_C(CC_C(CC_B(_, _, _))) => 12 
  case CC_C(CC_C(CC_C(_))) => 13 
}
}