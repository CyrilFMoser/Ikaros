package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_B[Boolean]], b: (T_B[(Int,Byte)],T_A[Byte])) extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: (T_B[CC_A],T_A[CC_A]), b: CC_A, c: T_B[T_B[Boolean]]) extends T_A[T_A[T_A[Byte]]]
case class CC_C[C]() extends T_B[C]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_C(),_)) => 0 
  case CC_B(_, _, _) => 1 
}
}