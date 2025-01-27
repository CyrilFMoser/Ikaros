package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[Char, T_A[Char, Boolean]]) extends T_A[T_A[CC_A[T_A[Char, Char]], CC_A[T_A[Char, Char]]], CC_A[T_A[Char, Char]]]
case class CC_C[D](a: T_A[T_A[D, D], D], b: CC_B) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[CC_A[T_A[Char, Char]], CC_A[T_A[Char, Char]]], CC_A[T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _) => 2 
}
}