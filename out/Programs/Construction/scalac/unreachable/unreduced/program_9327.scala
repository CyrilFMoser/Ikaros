package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: (T_A[Int, T_B],Boolean)) extends T_A[T_B, C]
case class CC_B[D]() extends T_A[T_B, D]
case class CC_C[E](a: T_B) extends T_A[T_B, E]
case class CC_D(a: T_A[T_B, CC_A[Byte]], b: T_A[T_A[T_B, Boolean], CC_A[T_B]]) extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D(CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_D(CC_B(), _), _) => 1 
  case CC_A(_, CC_D(CC_C(_), _), _) => 2 
  case CC_B() => 3 
  case CC_C(CC_D(CC_A(_, _, _), _)) => 4 
  case CC_C(CC_D(CC_B(), _)) => 5 
  case CC_C(CC_D(CC_C(_), _)) => 6 
}
}