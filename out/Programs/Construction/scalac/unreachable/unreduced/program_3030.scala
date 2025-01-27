package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_B[Char]]]
case class CC_B[C](a: CC_A, b: T_B[C]) extends T_A[C]
case class CC_C() extends T_A[T_A[T_B[Char]]]
case class CC_D[D](a: D, b: T_A[D], c: CC_A) extends T_B[CC_C]

val v_a: T_A[T_A[T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _) => 1 
}
}
// This is not matched: CC_C()