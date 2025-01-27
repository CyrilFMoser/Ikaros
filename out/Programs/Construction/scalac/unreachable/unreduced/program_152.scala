package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[C, C], C]]
case class CC_B() extends T_A[CC_A[T_A[Char, Int]], T_A[T_A[CC_A[T_A[Char, Int]], CC_A[T_A[Char, Int]]], CC_A[T_A[Char, Int]]]]

val v_a: T_A[CC_A[T_A[Char, Int]], T_A[T_A[CC_A[T_A[Char, Int]], CC_A[T_A[Char, Int]]], CC_A[T_A[Char, Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}