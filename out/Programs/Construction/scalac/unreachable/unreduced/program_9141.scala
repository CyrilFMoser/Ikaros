package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Byte, Int],T_A[Byte]), b: T_B[Char, T_B[Byte, Int]]) extends T_A[T_A[T_A[Boolean]]]
case class CC_B() extends T_A[T_A[T_A[Boolean]]]
case class CC_C(a: CC_A, b: T_A[CC_B], c: T_A[Boolean]) extends T_A[T_A[T_A[Boolean]]]
case class CC_D[D](a: CC_B, b: D, c: T_B[D, CC_B]) extends T_B[D, CC_B]

val v_a: T_A[T_A[T_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(CC_A((_,_), _), _, _)