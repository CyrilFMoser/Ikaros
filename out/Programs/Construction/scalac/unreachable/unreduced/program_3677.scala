package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[(Int,(Byte,Boolean)), (Char,Char)], C]
case class CC_B[D]() extends T_A[T_A[(Int,(Byte,Boolean)), (Char,Char)], D]

val v_a: T_A[T_A[(Int,(Byte,Boolean)), (Char,Char)], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}