package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C]) extends T_A[C, T_A[T_A[Int, Boolean], T_A[(Boolean,Char), Byte]]]
case class CC_B[D]() extends T_A[D, T_A[T_A[Int, Boolean], T_A[(Boolean,Char), Byte]]]
case class CC_C[E](a: Int) extends T_A[E, T_A[T_A[Int, Boolean], T_A[(Boolean,Char), Byte]]]

val v_a: T_A[Int, T_A[T_A[Int, Boolean], T_A[(Boolean,Char), Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
  case CC_C(_) => 2 
}
}