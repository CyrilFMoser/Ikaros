package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_B[T_B[Char, Boolean], T_B[Boolean, Char]]]
case class CC_B[D](a: T_A[D], b: T_B[D, CC_A], c: Boolean) extends T_B[D, CC_A]
case class CC_C[F, E](a: T_B[E, E], b: T_B[E, CC_A], c: CC_A) extends T_B[E, F]
case class CC_D() extends T_B[Int, CC_A]

val v_a: T_B[Int, CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, CC_B(_, _, _), CC_A(_)) => 1 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_B(_, _, _), _), CC_A(_)) => 2 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_C(_, _, _), _), CC_A(_)) => 3 
  case CC_C(_, CC_D(), CC_A(_)) => 4 
  case CC_D() => 5 
}
}
// This is not matched: CC_C(_, CC_C(CC_C(_, _, _), CC_D(), _), CC_A(_))