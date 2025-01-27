package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_B[D](a: (T_A[Int],T_A[Char]), b: (T_A[Int],CC_A[Char])) extends T_A[D]
case class CC_C[E](a: T_A[T_A[E]]) extends T_A[E]
case class CC_D(a: CC_A[CC_C[(Int,Char)]], b: T_A[T_A[Boolean]]) extends T_B[CC_B[T_A[Char]]]
case class CC_E(a: T_B[CC_D], b: T_A[CC_A[CC_D]]) extends T_B[CC_B[T_A[Char]]]
case class CC_F(a: CC_A[T_A[CC_D]]) extends T_B[CC_B[T_A[Char]]]

val v_a: T_B[CC_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), _) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_) => 2 
}
}