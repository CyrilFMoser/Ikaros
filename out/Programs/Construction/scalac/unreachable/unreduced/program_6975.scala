package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[T_A[Byte]]]
case class CC_B() extends T_A[T_B[T_A[Byte]]]
case class CC_C(a: CC_A, b: Char, c: T_A[T_A[CC_B]]) extends T_A[T_B[T_A[Byte]]]
case class CC_D(a: T_B[CC_B], b: CC_B) extends T_B[CC_B]

val v_a: T_A[T_B[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()