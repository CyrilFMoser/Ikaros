package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B[B](a: T_A[T_A[Boolean]], b: T_B, c: B) extends T_A[T_A[Boolean]]
case class CC_C(a: Boolean, b: T_B, c: CC_B[T_A[CC_A]]) extends T_A[T_A[Boolean]]
case class CC_D(a: Boolean, b: CC_B[(CC_A,CC_A)]) extends T_B

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_A(CC_C(_, _, _))) => 2 
  case CC_A(CC_B(_, _, _)) => 3 
  case CC_A(CC_C(_, CC_D(_, _), CC_B(_, _, _))) => 4 
  case CC_B(CC_A(_), CC_D(_, _), _) => 5 
  case CC_B(CC_B(_, CC_D(_, _), _), CC_D(_, _), _) => 6 
  case CC_B(CC_C(_, CC_D(_, _), CC_B(_, _, _)), CC_D(_, _), _) => 7 
  case CC_C(_, CC_D(_, CC_B(_, _, _)), CC_B(CC_A(_), CC_D(_, _), _)) => 8 
  case CC_C(_, CC_D(_, CC_B(_, _, _)), CC_B(CC_B(_, _, _), CC_D(_, _), _)) => 9 
  case CC_C(_, CC_D(_, CC_B(_, _, _)), CC_B(CC_C(_, _, _), CC_D(_, _), _)) => 10 
}
}