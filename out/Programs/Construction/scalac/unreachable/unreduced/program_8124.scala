package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: (T_A[Byte],T_A[Byte]), b: T_B[C], c: T_A[C]) extends T_A[T_A[T_B[Int]]]
case class CC_B(a: T_B[T_A[Byte]]) extends T_A[T_A[T_B[Int]]]

val v_a: T_A[T_A[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(_) => 1 
}
}