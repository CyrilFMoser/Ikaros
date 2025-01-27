package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Int, b: T_A[T_B[Boolean, Char]]) extends T_A[T_B[T_A[Char], T_A[Byte]]]
case class CC_B() extends T_A[T_B[T_A[Char], T_A[Byte]]]
case class CC_C[D](a: D, b: CC_A, c: T_A[D]) extends T_A[T_B[T_A[Char], T_A[Byte]]]

val v_a: T_A[T_B[T_A[Char], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_, CC_A(_, _), _) => 2 
}
}