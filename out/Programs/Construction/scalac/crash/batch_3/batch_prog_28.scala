package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[T_A[Int]], c: Int) extends T_A[T_B[T_A[Boolean]]]
case class CC_B(a: T_A[CC_A], b: CC_A) extends T_A[T_B[T_A[Boolean]]]
case class CC_C(a: Int) extends T_B[T_A[T_B[CC_B]]]
case class CC_D() extends T_B[T_A[T_B[CC_B]]]

val v_a: T_B[T_A[T_B[CC_B]]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: CC_D()