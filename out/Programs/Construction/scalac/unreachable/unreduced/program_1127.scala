package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, T_B[C, C]], b: T_B[C, C], c: T_B[C, C]) extends T_A
case class CC_B(a: Boolean, b: CC_A[CC_A[Boolean]], c: CC_A[T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D[D](a: D, b: CC_C) extends T_B[CC_A[D], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_C() => 2 
}
}