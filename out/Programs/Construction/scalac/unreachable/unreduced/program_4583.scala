package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[T_A[Int]]) extends T_A[T_B[T_A[Char]]]
case class CC_B(a: T_A[CC_A]) extends T_A[T_B[T_A[Char]]]
case class CC_C() extends T_A[T_B[T_A[Char]]]
case class CC_D[C]() extends T_B[C]
case class CC_E(a: CC_A) extends T_B[Byte]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)