package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Boolean], b: (T_A[T_B],(T_B,(Int,Boolean))), c: T_A[T_A[Boolean]]) extends T_A[T_A[Boolean]]
case class CC_B() extends T_A[T_A[Boolean]]
case class CC_C(a: Boolean) extends T_B
case class CC_D(a: CC_C, b: T_A[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_, _) => 1 
}
}