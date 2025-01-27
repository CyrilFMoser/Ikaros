package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Char,Byte), b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[C, T_A[C, C]], C]
case class CC_B[D](a: D, b: T_A[D, D], c: (T_A[Int, Byte],CC_A[Char])) extends T_A[T_A[D, T_A[D, D]], D]
case class CC_C[E]() extends T_A[T_A[E, T_A[E, E]], E]

val v_a: T_A[T_A[Int, T_A[Int, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_B(12, _, (_,CC_A(_, _, _))) => 1 
  case CC_B(_, _, (_,CC_A(_, _, _))) => 2 
  case CC_C() => 3 
}
}