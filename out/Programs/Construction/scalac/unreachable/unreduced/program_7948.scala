package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Char]]]
case class CC_B(a: CC_A, b: Char) extends T_A[T_B[T_A[Char]]]
case class CC_C(a: CC_B, b: T_A[(Char,Boolean)]) extends T_A[T_B[T_A[Char]]]
case class CC_D[C](a: T_B[C], b: T_A[C]) extends T_B[C]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(CC_A(), _)