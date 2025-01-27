package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[C], b: T_B[C]) extends T_A[C]
case class CC_B() extends T_B[T_B[T_A[Int]]]
case class CC_C(a: T_A[T_B[Int]], b: T_A[T_A[CC_B]]) extends T_B[T_B[T_A[Int]]]
case class CC_D() extends T_B[T_B[T_A[Int]]]

val v_a: T_B[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, _), _) => 1 
  case CC_D() => 2 
}
}