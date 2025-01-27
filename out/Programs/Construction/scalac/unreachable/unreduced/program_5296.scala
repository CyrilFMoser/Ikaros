package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, T_A[D, D]], b: (T_B[Char],T_A[Boolean, Int]), c: T_A[D, D]) extends T_A[D, T_B[T_A[Byte, Byte]]]
case class CC_B(a: T_B[CC_A[Char]]) extends T_B[T_A[T_B[Char], T_B[Boolean]]]
case class CC_C(a: T_B[T_A[CC_B, CC_B]]) extends T_B[T_A[T_B[Char], T_B[Boolean]]]
case class CC_D() extends T_B[T_A[T_B[Char], T_B[Boolean]]]

val v_a: T_B[T_A[T_B[Char], T_B[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
  case CC_D() => 2 
}
}