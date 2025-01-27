package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B(a: T_A[T_B[Char, (Byte,Byte)]], b: T_A[Char]) extends T_A[T_B[T_A[Int], CC_A[Byte]]]
case class CC_C[E](a: T_A[E]) extends T_B[T_A[Int], E]

val v_a: T_A[T_B[T_A[Int], CC_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, CC_C(_), CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, CC_C(_), CC_B(_, _))) => 1 
  case CC_A(_, _, CC_B(_, _)) => 2 
  case CC_B(_, _) => 3 
}
}