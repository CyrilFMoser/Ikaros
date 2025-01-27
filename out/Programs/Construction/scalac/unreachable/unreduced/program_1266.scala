package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B[D](a: CC_A[D], b: D) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C() extends T_A[CC_A[T_A[Boolean, Boolean]], T_A[T_A[CC_A[T_A[Boolean, Boolean]], CC_A[T_A[Boolean, Boolean]]], CC_A[T_A[Boolean, Boolean]]]]

val v_a: T_A[CC_A[T_A[Boolean, Boolean]], T_A[T_A[CC_A[T_A[Boolean, Boolean]], CC_A[T_A[Boolean, Boolean]]], CC_A[T_A[Boolean, Boolean]]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}