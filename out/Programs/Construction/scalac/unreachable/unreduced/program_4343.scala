package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Byte]], b: T_A[T_A[Boolean]], c: T_B[T_A[Boolean]]) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_B(a: (T_A[CC_A],Int)) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_C(a: CC_A) extends T_A[T_A[T_A[(Int,Byte)]]]
case class CC_D(a: Int, b: T_B[T_A[CC_A]], c: T_B[CC_A]) extends T_B[T_A[(Int,CC_A)]]
case class CC_E[C](a: T_B[C], b: C) extends T_B[C]

val v_a: T_A[T_A[T_A[(Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_A(_, _, CC_E(_, _))