package Program_17 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Int]], c: Byte) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: T_A[CC_A], b: CC_B, c: CC_A) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_A(_, _, _)