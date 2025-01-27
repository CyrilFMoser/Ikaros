package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[T_A[C, C], T_A[C, C]]]
case class CC_B[D](a: T_A[D, D], b: CC_A[D]) extends T_A[D, T_A[T_A[D, D], T_A[D, D]]]
case class CC_C() extends T_A[CC_A[T_A[Int, Int]], CC_A[Boolean]]

val v_a: T_A[Char, T_A[T_A[Char, Char], T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}