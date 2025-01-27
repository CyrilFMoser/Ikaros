package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Boolean], Int], b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[Boolean]], b: CC_A) extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, _, CC_B(_, _)), _) => 1 
  case CC_A(_, CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
}
}