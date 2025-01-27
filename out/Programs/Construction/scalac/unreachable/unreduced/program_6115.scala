package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Boolean]], b: T_A[(Byte,Byte)]) extends T_A[T_A[T_A[Char]]]
case class CC_B(a: Byte, b: CC_A) extends T_A[T_A[T_A[Char]]]
case class CC_C(a: CC_B, b: (T_A[CC_A],CC_A), c: CC_A) extends T_A[T_A[T_A[Char]]]

val v_a: T_A[T_A[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)