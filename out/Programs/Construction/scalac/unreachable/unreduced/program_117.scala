package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int) extends T_A[C]
case class CC_B(a: CC_A[T_A[Int]], b: T_B[T_A[Boolean]]) extends T_B[T_A[T_A[Boolean]]]
case class CC_C() extends T_B[T_A[T_A[Boolean]]]
case class CC_D() extends T_B[CC_B]

val v_a: T_B[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _) => 0 
  case CC_C() => 1 
}
}