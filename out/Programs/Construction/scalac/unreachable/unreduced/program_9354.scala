package Program_20 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[CC_A], b: CC_A, c: CC_A) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_A[T_A[CC_A]]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A(), CC_A()) => 1 
  case CC_C(_) => 2 
}
}