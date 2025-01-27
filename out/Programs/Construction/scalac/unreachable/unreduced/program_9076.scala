package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Boolean,Byte)]) extends T_A[T_A[T_A[Int]]]
case class CC_B[C]() extends T_A[T_A[T_A[Int]]]
case class CC_C(a: CC_A, b: T_A[CC_A], c: CC_B[Int]) extends T_A[T_A[T_A[Int]]]
case class CC_D[D]() extends T_B[D]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}