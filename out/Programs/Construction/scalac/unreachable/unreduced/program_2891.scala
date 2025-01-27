package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_B[T_A, T_B[T_A, CC_B]], b: CC_A[CC_A[T_A]], c: T_A) extends T_A
case class CC_D[D, E]() extends T_B[Int, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(CC_A(_))) => 3 
  case CC_A(CC_B(CC_B(_))) => 4 
  case CC_A(CC_B(CC_C(_, _, _))) => 5 
  case CC_A(CC_C(_, _, _)) => 6 
  case CC_B(_) => 7 
  case CC_C(_, CC_A(CC_A(_)), _) => 8 
  case CC_C(_, CC_A(CC_B(_)), _) => 9 
  case CC_C(_, CC_A(CC_C(_, _, _)), _) => 10 
}
}