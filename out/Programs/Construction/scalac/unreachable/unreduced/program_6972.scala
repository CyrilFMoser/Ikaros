package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: Boolean, b: Int) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: (T_A[CC_A],CC_A), b: Int, c: T_A[Int]) extends T_A[T_A[T_A[Int]]]
case class CC_C() extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}