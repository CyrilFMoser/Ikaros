package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Int]]]
case class CC_B(a: T_B[Int]) extends T_A[T_B[T_A[Int]]]
case class CC_C(a: CC_B, b: T_A[T_A[Boolean]]) extends T_A[T_B[CC_B]]
case class CC_D(a: CC_C, b: Char) extends T_B[CC_A]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}