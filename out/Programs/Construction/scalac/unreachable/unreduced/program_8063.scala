package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[Char]) extends T_A[T_B[Byte]]
case class CC_C[D](a: T_A[T_B[Byte]], b: D, c: D) extends T_A[D]
case class CC_D() extends T_B[T_A[CC_B]]
case class CC_E(a: Char) extends T_B[T_A[Boolean]]

val v_a: T_A[T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_))) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _, _))) => 2 
  case CC_A(_, CC_B(_)) => 3 
  case CC_A(_, CC_C(_, _, _)) => 4 
  case CC_B(CC_A(_, CC_A(_, _))) => 5 
  case CC_B(CC_A(_, CC_C(_, _, _))) => 6 
  case CC_B(CC_C(CC_A(_, _), _, _)) => 7 
  case CC_B(CC_C(CC_B(_), _, _)) => 8 
  case CC_B(CC_C(CC_C(_, _, _), _, _)) => 9 
  case CC_C(CC_A(_, CC_A(_, _)), _, _) => 10 
  case CC_C(CC_A(_, CC_B(_)), _, _) => 11 
  case CC_C(CC_A(_, CC_C(_, _, _)), _, _) => 12 
  case CC_C(CC_B(CC_A(_, _)), _, _) => 13 
  case CC_C(CC_B(CC_C(_, _, _)), _, _) => 14 
  case CC_C(CC_C(_, _, _), _, _) => 15 
}
}