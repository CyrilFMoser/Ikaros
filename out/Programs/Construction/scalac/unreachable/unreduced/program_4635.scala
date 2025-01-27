package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Byte, b: T_B[C], c: T_A[C]) extends T_A[C]
case class CC_B[D](a: Char) extends T_A[D]
case class CC_C[E](a: Byte, b: E) extends T_B[CC_B[T_A[Int]]]
case class CC_D(a: (CC_C[Byte],CC_C[Int]), b: T_A[(Byte,Int)], c: T_B[(Int,Boolean)]) extends T_B[CC_B[T_A[Int]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_B(_)) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: CC_A(_, _, CC_A(_, _, CC_B(_)))