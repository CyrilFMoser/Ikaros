package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_B[Byte, (Char,(Int,Byte))], b: Byte, c: (Byte,T_B[Int, Byte])) extends T_A[T_A[T_B[Boolean, Char], Char], T_A[Int, T_A[Byte, Char]]]
case class CC_B(a: T_B[Boolean, Int], b: Boolean, c: T_A[CC_A, T_B[CC_A, CC_A]]) extends T_A[T_A[T_B[Boolean, Char], Char], T_A[Int, T_A[Byte, Char]]]
case class CC_C(a: CC_A, b: CC_A) extends T_A[T_A[T_B[Boolean, Char], Char], T_A[Int, T_A[Byte, Char]]]
case class CC_D[E]() extends T_B[CC_A, E]

val v_a: T_A[T_A[T_B[Boolean, Char], Char], T_A[Int, T_A[Byte, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, (_,_)) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: CC_A(_, _, (_,_))