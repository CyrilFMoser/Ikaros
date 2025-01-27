package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: C, b: T_B[C, C]) extends T_A
case class CC_B(a: T_B[T_A, Boolean], b: T_A) extends T_A
case class CC_C(a: Boolean, b: CC_A[CC_B]) extends T_A
case class CC_D[D](a: T_B[Int, D], b: CC_B, c: T_A) extends T_B[Int, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _)) => 1 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_C(_, _))) => 4 
  case CC_B(_, CC_C(_, CC_A(_, _))) => 5 
  case CC_C(true, CC_A(CC_B(_, _), _)) => 6 
  case CC_C(false, CC_A(CC_B(_, _), _)) => 7 
}
}