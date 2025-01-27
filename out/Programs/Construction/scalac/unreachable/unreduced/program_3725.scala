package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: C) extends T_A[C]
case class CC_B[D](a: D, b: T_B[D], c: D) extends T_A[D]
case class CC_C(a: Int, b: Boolean, c: T_B[Boolean]) extends T_B[Boolean]
case class CC_D(a: T_B[T_B[Boolean]], b: CC_B[T_A[(Boolean,Char)]]) extends T_B[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_C(_, _, _), true) => 1 
  case CC_B(_, CC_D(_, _), true) => 2 
  case CC_B(_, CC_C(_, _, _), false) => 3 
  case CC_B(_, CC_D(_, _), false) => 4 
}
}