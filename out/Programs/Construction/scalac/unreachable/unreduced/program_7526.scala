package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_A[Int, Char], Char], C]
case class CC_B[D](a: (T_A[(Char,Byte), Byte],CC_A[Boolean]), b: D, c: CC_A[D]) extends T_A[T_A[T_A[Int, Char], Char], D]
case class CC_C[E](a: E, b: T_A[E, E], c: E) extends T_A[T_A[T_A[Int, Char], Char], T_A[CC_A[(Byte,Int)], CC_A[Int]]]

val v_a: T_A[T_A[T_A[Int, Char], Char], T_A[CC_A[(Byte,Int)], CC_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, CC_A(_, _)) => 1 
  case CC_C(_, _, _) => 2 
}
}