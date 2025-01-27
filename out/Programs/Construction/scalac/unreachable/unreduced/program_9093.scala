package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[Boolean]]) extends T_A[Boolean]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[T_A[Boolean]], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_C(a: T_A[Boolean]) extends T_A[Boolean]
case class CC_D(a: CC_C) extends T_B[T_A[T_A[CC_B]]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}