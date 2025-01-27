package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: (T_A[T_B, (Char,Byte)],(T_B,(Char,Char))), c: ((Int,T_B),Int)) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, D]) extends T_A[T_B, Char]
case class CC_C[E](a: T_B, b: T_A[T_B, E]) extends T_A[T_B, E]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, (_,_), (_,_))) => 0 
  case CC_B(CC_C(_, CC_A(_, _, _))) => 1 
  case CC_B(CC_C(_, CC_C(_, _))) => 2 
}
}