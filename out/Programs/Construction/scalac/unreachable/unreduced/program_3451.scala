package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, C]) extends T_A[C, T_A[Int, T_A[Byte, (Boolean,Char)]]]
case class CC_B() extends T_A[Char, T_A[Int, T_A[Byte, (Boolean,Char)]]]

val v_a: T_A[Char, T_A[Int, T_A[Byte, (Boolean,Char)]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}