package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_B[Int]]]
case class CC_B(a: T_B[T_A[Int]], b: Int, c: T_A[T_B[CC_A]]) extends T_A[T_B[T_B[Int]]]
case class CC_C(a: T_B[Byte], b: CC_A, c: (T_A[CC_A],CC_A)) extends T_A[T_B[T_B[Int]]]
case class CC_D[C]() extends T_B[C]

val v_a: T_A[T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(), _, _) => 1 
  case CC_C(CC_D(), CC_A(), _) => 2 
}
}