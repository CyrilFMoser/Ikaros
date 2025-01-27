package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_A[Char]]) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: T_A[T_B[Int]]) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: CC_B, b: T_B[T_A[CC_A]], c: T_B[CC_B]) extends T_A[T_B[T_A[Char]]]
case class CC_D[C](a: T_B[C], b: T_B[C]) extends T_B[C]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_)