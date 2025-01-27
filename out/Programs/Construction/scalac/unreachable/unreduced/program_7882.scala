package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]], b: Boolean, c: T_B[Char]) extends T_A[T_B[T_A[Int]]]
case class CC_B(a: Byte, b: Char) extends T_A[T_B[T_A[Int]]]
case class CC_C[C](a: Boolean, b: T_A[C], c: (T_A[CC_B],T_B[CC_B])) extends T_B[C]
case class CC_D[D](a: (T_A[CC_A],CC_C[CC_A]), b: T_A[D], c: CC_A) extends T_B[D]

val v_a: T_A[T_B[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_C(_, _, _)) => 0 
  case CC_A(_, _, CC_D(_, _, _)) => 1 
  case CC_B(_, _) => 2 
}
}