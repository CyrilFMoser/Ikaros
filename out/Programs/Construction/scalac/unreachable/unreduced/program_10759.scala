package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D]() extends T_A[T_A[D, D], D]
case class CC_C(a: CC_A[Boolean], b: CC_A[T_A[Char, Int]], c: Char) extends T_A[T_A[CC_A[T_A[Char, Int]], CC_A[T_A[Char, Int]]], CC_A[T_A[Char, Int]]]

val v_a: T_A[T_A[CC_C, CC_C], CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}