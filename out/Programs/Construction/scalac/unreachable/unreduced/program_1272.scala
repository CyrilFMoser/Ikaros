package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[(Char,Int), T_A[Byte, Char]], C]
case class CC_B[D](a: (T_A[Int, Byte],CC_A[Char]), b: T_A[D, D], c: T_A[T_A[D, D], D]) extends T_A[T_A[(Char,Int), T_A[Byte, Char]], D]
case class CC_C[E](a: CC_A[E], b: T_A[E, E], c: Boolean) extends T_A[T_A[(Char,Int), T_A[Byte, Char]], E]

val v_a: T_A[T_A[(Char,Int), T_A[Byte, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _, _) => 1 
  case CC_C(CC_A(), _, _) => 2 
}
}