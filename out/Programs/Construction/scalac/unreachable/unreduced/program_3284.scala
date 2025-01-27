package Program_28 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Char, b: T_A[CC_A], c: T_A[(CC_A,CC_A)]) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}