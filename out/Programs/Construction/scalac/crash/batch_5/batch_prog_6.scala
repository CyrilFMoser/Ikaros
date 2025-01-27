package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Boolean]]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_B[Int]]]
case class CC_C[C]() extends T_A[C]
case class CC_D(a: T_B[(CC_B,Boolean)], b: CC_B) extends T_B[CC_B]
case class CC_E() extends T_B[CC_B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}