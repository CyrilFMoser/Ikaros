package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: T_B[T_A[Boolean]], b: CC_A[Int], c: T_A[T_B[Char]]) extends T_A[T_A[CC_A[Int]]]
case class CC_C[D](a: T_A[D], b: T_B[D]) extends T_A[T_A[CC_A[Int]]]
case class CC_D() extends T_B[CC_A[CC_C[CC_B]]]
case class CC_E(a: T_A[T_B[Int]]) extends T_B[CC_A[CC_C[CC_B]]]
case class CC_F() extends T_B[CC_E]

val v_a: T_A[T_A[CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, CC_A(_), _) => 1 
}
}
// This is not matched: CC_C(_, _)