package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D]) extends T_A[T_A[T_B[Boolean], T_A[Char, Int]], D]
case class CC_B() extends T_B[T_A[CC_A[Byte], CC_A[Char]]]
case class CC_C(a: T_A[Int, T_B[CC_B]]) extends T_B[T_A[CC_A[Byte], CC_A[Char]]]
case class CC_D(a: CC_B, b: CC_B, c: T_A[CC_A[Char], T_B[CC_C]]) extends T_B[T_A[CC_A[Byte], CC_A[Char]]]

val v_a: T_B[T_A[CC_A[Byte], CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
  case CC_D(_, _, _) => 2 
}
}