package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: (Int,Boolean)) extends T_A[T_A[Int, Int], C]

val v_a: T_A[T_A[Int, Int], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_)) => 0 
}
}
// This is not matched: (CC_C Byte (Tuple Char Int) (T_A Byte (Tuple Char Int)))