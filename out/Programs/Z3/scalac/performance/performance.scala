object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D]() extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_A(_, _), _) => 1 
  case CC_A(_, _) => 2 
  case CC_A(_, _) => 3 
  case CC_A(_, CC_A(_, _)) => 4 
  case CC_A(CC_A(_, CC_A(_, _)), _) => 5 
  case CC_A(CC_A(_, _), _) => 6 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(_, _)) => 7 
  case CC_A(CC_A(CC_C(), CC_A(_, _)), _) => 8 
  case CC_A(CC_A(CC_C(), _), _) => 9 
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 10 
  case CC_A(_, CC_B()) => 11 
  case CC_A(_, _) => 12 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 13 
  case CC_A(CC_A(CC_A(_, _), _), _) => 14 
  case CC_A(_, CC_A(_, CC_A(_, _))) => 15 
  case CC_A(_, CC_A(CC_A(_, _), _)) => 16 
  case CC_A(CC_A(CC_A(_, _), CC_B()), _) => 17 
  case CC_A(_, CC_A(CC_A(_, _), CC_A(_, _))) => 18 
  case CC_A(CC_A(CC_B(), _), CC_A(CC_C(), CC_C())) => 19 
  case CC_A(CC_A(CC_B(), _), CC_C()) => 20 
  case CC_A(CC_A(CC_A(_, _), CC_C()), CC_C()) => 21 
}
}