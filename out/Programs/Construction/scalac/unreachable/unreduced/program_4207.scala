package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Char]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_A[T_B[Char]]]
case class CC_C[C](a: CC_A, b: C) extends T_B[C]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}