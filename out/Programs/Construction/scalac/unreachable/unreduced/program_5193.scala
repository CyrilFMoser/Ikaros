package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Int], T_A[Byte]]) extends T_A[T_B[T_A[Int], T_A[Int]]]
case class CC_B(a: (CC_A,T_B[CC_A, CC_A]), b: CC_A) extends T_A[T_B[T_A[Int], T_A[Int]]]
case class CC_C[D](a: (Int,(CC_B,CC_B))) extends T_B[CC_A, D]
case class CC_D[E](a: CC_B, b: T_A[E]) extends T_B[CC_A, E]

val v_a: T_A[T_B[T_A[Int], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}