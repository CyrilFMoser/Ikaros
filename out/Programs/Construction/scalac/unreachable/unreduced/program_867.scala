package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_A[T_A[Byte]]]
case class CC_B(a: T_A[(CC_A,(Byte,Char))], b: T_B[CC_A, T_A[CC_A]], c: CC_A) extends T_A[T_A[T_A[Byte]]]
case class CC_C[D, E](a: Byte, b: T_A[D], c: T_A[D]) extends T_B[E, D]

val v_a: T_A[T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_C(_, _, _), CC_A()) => 1 
}
}