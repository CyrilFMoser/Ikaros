package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: CC_A, b: (Int,(CC_A,CC_A))) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}