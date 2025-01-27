package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Byte, Char], T_A[Int, Byte]]]
case class CC_B[D](a: CC_A[D], b: (Char,(Boolean,(Boolean,Char)))) extends T_A[D, T_A[T_A[Byte, Char], T_A[Int, Byte]]]
case class CC_C[E](a: T_A[E, E], b: E) extends T_A[E, T_A[T_A[Byte, Char], T_A[Int, Byte]]]

val v_a: T_A[Int, T_A[T_A[Byte, Char], T_A[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}