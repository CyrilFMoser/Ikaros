package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[T_A[Int]]]
case class CC_B(a: T_A[T_A[CC_A]], b: T_A[Byte], c: T_A[T_A[Byte]]) extends T_A[Byte]
case class CC_C[C](a: C, b: C, c: CC_B) extends T_B[C]
case class CC_D[D](a: T_A[Byte], b: (Byte,T_B[Char])) extends T_B[D]
case class CC_E[E](a: T_B[E], b: T_B[E], c: E) extends T_B[E]

val v_a: T_B[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D(CC_B(_, _, _), (_,CC_D(_, _))) => 1 
  case CC_D(CC_B(_, _, _), (_,CC_E(_, _, _))) => 2 
  case CC_E(CC_C(_, CC_B(_, _, _), _), _, _) => 3 
  case CC_E(CC_D(CC_B(_, _, _), _), _, _) => 4 
  case CC_E(CC_E(_, _, _), _, _) => 5 
}
}
// This is not matched: CC_D(CC_B(_, _, _), (_,CC_C(_, _, _)))