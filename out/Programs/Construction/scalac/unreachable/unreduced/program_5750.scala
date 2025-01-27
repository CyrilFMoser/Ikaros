package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[(Byte,Int)], b: T_B[Int]) extends T_A[T_A[T_B[Byte]]]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C(a: (CC_A,T_B[Byte]), b: CC_A, c: T_A[CC_A]) extends T_B[Byte]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}