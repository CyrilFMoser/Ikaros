package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Int,Byte), Boolean],T_A[(Byte,Byte), Boolean]), b: T_A[C, C], c: T_A[C, C]) extends T_A[C, T_A[T_A[Boolean, Int], T_A[Char, Boolean]]]
case class CC_B() extends T_A[CC_A[Int], T_A[T_A[Boolean, Int], T_A[Char, Boolean]]]
case class CC_C[D]() extends T_A[D, T_A[T_A[Boolean, Int], T_A[Char, Boolean]]]

val v_a: T_A[CC_A[Int], T_A[T_A[Boolean, Int], T_A[Char, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C() => 2 
}
}