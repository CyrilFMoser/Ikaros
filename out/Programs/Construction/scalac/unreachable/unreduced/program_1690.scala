package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: Int, b: Int) extends T_A[CC_A]
case class CC_C(a: Char, b: T_A[T_A[Boolean]]) extends T_A[CC_A]

val v_a: T_A[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, 12) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}