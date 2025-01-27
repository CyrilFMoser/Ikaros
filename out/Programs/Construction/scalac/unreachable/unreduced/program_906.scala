package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: E, b: Char, c: T_A[E]) extends T_A[E]
case class CC_C(a: CC_B[T_A[Byte]]) extends T_B[CC_B[Int], T_A[T_A[Boolean]]]
case class CC_D(a: T_B[CC_A[CC_C], (Boolean,CC_C)], b: T_A[Char]) extends T_B[CC_B[Int], T_A[T_A[Boolean]]]
case class CC_E(a: T_A[T_A[Int]], b: T_A[CC_B[CC_D]], c: (CC_C,Boolean)) extends T_B[CC_B[Int], T_A[T_A[Boolean]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}