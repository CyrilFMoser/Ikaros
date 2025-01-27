package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A(a: Byte, b: T_A[Byte], c: Int) extends T_A[T_A[T_A[Byte]]]
case class CC_B() extends T_A[T_A[T_A[Byte]]]
case class CC_C(a: CC_B, b: ((Boolean,CC_A),CC_B)) extends T_A[T_A[T_A[Byte]]]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(0, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_B(), _) => 2 
}
}
// This is not matched: CC_A(_, _, _)