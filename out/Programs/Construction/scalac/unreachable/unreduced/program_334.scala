package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[T_A[Byte]], b: T_A[T_B[Int]]) extends T_A[T_B[T_B[Boolean]]]
case class CC_C(a: T_A[(CC_B,CC_B)]) extends T_A[T_B[T_B[Boolean]]]
case class CC_D(a: CC_B) extends T_B[T_A[Int]]

val v_a: T_A[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_, _))