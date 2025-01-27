package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C[C](a: CC_A, b: C) extends T_B[C]
case class CC_D(a: Int, b: Int) extends T_B[T_B[T_A[CC_A]]]
case class CC_E(a: T_B[Byte], b: T_A[CC_B]) extends T_B[T_B[T_A[CC_A]]]

val v_a: T_B[T_B[T_A[CC_A]]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), CC_C(_, _)) => 0 
  case CC_D(_, _) => 1 
  case CC_E(_, _) => 2 
}
}