package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], T_A[C, C]], c: T_A[C, C]) extends T_A[C, T_A[T_A[(Byte,Byte), Char], T_A[Boolean, Boolean]]]
case class CC_B[D]() extends T_A[CC_A[T_A[Int, Byte]], T_A[T_A[(Byte,Byte), Char], T_A[Boolean, Boolean]]]

val v_a: T_A[CC_A[T_A[Int, Byte]], T_A[T_A[(Byte,Byte), Char], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}