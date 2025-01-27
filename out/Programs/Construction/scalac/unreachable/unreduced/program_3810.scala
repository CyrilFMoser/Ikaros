package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[T_A[T_B[Byte]]]
case class CC_B[D](a: T_A[D], b: CC_A[D], c: D) extends T_A[T_A[T_B[Byte]]]
case class CC_C[E](a: T_B[E]) extends T_A[E]
case class CC_D(a: Byte, b: (CC_A[Byte],CC_A[(Char,Int)])) extends T_B[CC_B[T_A[Byte]]]

val v_a: T_A[T_A[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}