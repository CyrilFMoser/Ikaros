package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Int, C], b: (T_A[Char, T_B],Char)) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: CC_A[(Int,Char)], c: (T_A[T_B, T_B],CC_A[(Int,Int)])) extends T_A[T_A[D, D], D]
case class CC_C[E]() extends T_A[T_A[E, E], E]
case class CC_D(a: Boolean, b: T_A[T_A[T_A[T_B, (Char,Int)], T_A[T_B, (Char,Int)]], T_A[T_B, (Char,Int)]]) extends T_B
case class CC_E(a: T_A[T_A[CC_A[(Byte,Int)], CC_A[(Byte,Int)]], CC_A[(Byte,Int)]], b: CC_A[T_A[CC_D, Char]]) extends T_B

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, (_,_)) => 0 
  case CC_B(_, CC_A(_, _), (_,CC_A(_, _))) => 1 
  case CC_C() => 2 
}
}