package Program_14 

object Test {
sealed trait T_A[A]
case class CC_A(a: (T_A[Boolean],T_A[(Int,Byte)]), b: T_A[T_A[Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B(a: (T_A[CC_A],(CC_A,CC_A)), b: CC_A) extends T_A[T_A[T_A[Int]]]

val v_a: T_A[T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}