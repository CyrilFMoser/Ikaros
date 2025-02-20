package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, Boolean]
case class CC_B[D](a: Int, b: CC_A[D]) extends T_A[T_A[T_A[Boolean, (Int,Boolean)], Boolean], Boolean]
case class CC_C[E](a: Int) extends T_A[E, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}