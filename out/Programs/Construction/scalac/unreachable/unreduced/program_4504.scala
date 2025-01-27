package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_C(a: Boolean) extends T_B[T_A[CC_B[Char]]]
case class CC_D(a: Int, b: CC_A[T_B[CC_C]]) extends T_B[T_A[CC_B[Char]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_B(_, CC_A(_)), CC_A(_)) => 2 
  case CC_B(CC_B(_, CC_B(_, _)), CC_A(_)) => 3 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_A(_))) => 4 
  case CC_B(CC_B(_, CC_A(_)), CC_B(CC_A(_), CC_A(_))) => 5 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(CC_A(_), CC_A(_))) => 6 
  case CC_B(CC_A(_), CC_B(CC_A(_), CC_B(_, _))) => 7 
  case CC_B(CC_B(_, CC_A(_)), CC_B(CC_A(_), CC_B(_, _))) => 8 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(CC_A(_), CC_B(_, _))) => 9 
  case CC_B(CC_A(_), CC_B(CC_B(_, _), CC_A(_))) => 10 
  case CC_B(CC_B(_, CC_A(_)), CC_B(CC_B(_, _), CC_A(_))) => 11 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(CC_B(_, _), CC_A(_))) => 12 
  case CC_B(CC_A(_), CC_B(CC_B(_, _), CC_B(_, _))) => 13 
  case CC_B(CC_B(_, CC_A(_)), CC_B(CC_B(_, _), CC_B(_, _))) => 14 
  case CC_B(CC_B(_, CC_B(_, _)), CC_B(CC_B(_, _), CC_B(_, _))) => 15 
}
}