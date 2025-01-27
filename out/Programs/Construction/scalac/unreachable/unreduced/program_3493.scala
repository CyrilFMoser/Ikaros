package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Char) extends T_A[T_B[D], D]
case class CC_B(a: (T_A[Boolean, Char],T_A[Byte, Byte])) extends T_B[T_A[T_A[Int, Byte], T_B[Char]]]
case class CC_C(a: T_B[CC_B], b: CC_A[Int]) extends T_B[T_A[T_A[Int, Byte], T_B[Char]]]
case class CC_D[E](a: E, b: T_A[T_B[E], E], c: Char) extends T_B[E]

val v_a: T_B[T_A[T_A[Int, Byte], T_B[Char]]] = null
val v_b: Int = v_a match{
  case CC_B((_,_)) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, _, _) => 2 
}
}