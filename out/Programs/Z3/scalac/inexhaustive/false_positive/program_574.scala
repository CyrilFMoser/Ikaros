package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (Int,Boolean), b: T_A[Int, C]) extends T_A[T_A[C, C], C]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A((12,_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants