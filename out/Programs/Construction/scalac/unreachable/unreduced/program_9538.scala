package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C]) extends T_A[C]
case class CC_B(a: Int, b: T_B[T_A[Byte]], c: T_A[(Byte,Byte)]) extends T_B[T_A[T_B[(Char,Int)]]]
case class CC_C[D](a: CC_A[D]) extends T_B[T_A[T_B[(Char,Int)]]]
case class CC_D(a: Boolean) extends T_B[T_A[T_B[(Char,Int)]]]

val v_a: T_B[T_A[T_B[(Char,Int)]]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
  case CC_D(_) => 2 
}
}