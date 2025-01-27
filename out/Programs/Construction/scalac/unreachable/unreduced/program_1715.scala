package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_A[Byte], T_A[Int]], b: T_A[(Char,Byte)], c: (T_B[Char, Char],(Int,Byte))) extends T_A[T_B[T_B[Int, Byte], T_A[Byte]]]
case class CC_B[D](a: Int, b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_C[E](a: T_A[E], b: Int) extends T_B[T_A[E], E]

val v_a: T_A[T_B[T_B[Int, Byte], T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_B(_, CC_A(_, _, _), _) => 1 
  case CC_B(_, CC_B(_, _, _), _) => 2 
}
}