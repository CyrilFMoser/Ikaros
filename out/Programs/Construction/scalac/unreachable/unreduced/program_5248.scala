package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Byte]], b: T_A[T_A[(Byte,Int)]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: Boolean) extends T_A[T_A[T_A[Int]]]
case class CC_C(a: T_B[CC_B]) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}