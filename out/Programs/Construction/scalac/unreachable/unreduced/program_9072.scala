package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_A[CC_A], b: CC_A, c: Boolean) extends T_A[T_A[T_B[Int]]]
case class CC_C(a: CC_B, b: CC_B) extends T_A[T_A[T_B[Int]]]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), _) => 1 
  case CC_C(_, _) => 2 
}
}