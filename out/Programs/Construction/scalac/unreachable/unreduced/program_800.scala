package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Int], (Char,Boolean)], C]
case class CC_B[D](a: (T_A[Char, Boolean],T_A[(Char,Boolean), Byte])) extends T_A[T_A[T_A[Boolean, Int], (Char,Boolean)], D]

val v_a: T_A[T_A[T_A[Boolean, Int], (Char,Boolean)], Int] = null
val v_b: Int = v_a match{
  case CC_A(12, _) => 0 
  case CC_A(_, _) => 1 
  case CC_B(_) => 2 
}
}