package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D](a: D) extends T_A[D]
case class CC_C[E](a: (CC_A[Byte],Int), b: T_B[E], c: E) extends T_A[E]
case class CC_D(a: T_B[T_A[Byte]], b: T_B[T_A[Byte]]) extends T_B[T_A[Byte]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(true) => 0 
  case CC_B(false) => 1 
  case CC_C((CC_A(),_), _, _) => 2 
}
}
// This is not matched: CC_A()