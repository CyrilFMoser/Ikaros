package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Byte,T_A[Char]), b: T_A[Char], c: T_B[T_B[Byte]]) extends T_A[T_B[T_B[Int]]]
case class CC_B[C](a: T_A[C], b: CC_A, c: T_A[C]) extends T_B[C]
case class CC_C(a: CC_A, b: T_B[T_B[CC_A]]) extends T_B[T_B[Boolean]]
case class CC_D[D](a: T_B[D]) extends T_B[D]

val v_a: T_B[T_B[T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(CC_D(_)) => 1 
}
}
// This is not matched: CC_D(CC_B(_, _, _))