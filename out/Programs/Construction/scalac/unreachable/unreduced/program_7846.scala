package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: (T_B[Char, Boolean],T_A[Int]), b: T_B[T_A[Int], Byte]) extends T_A[T_B[T_B[Char, Byte], T_A[Int]]]
case class CC_B() extends T_A[T_B[T_B[Char, Byte], T_A[Int]]]

val v_a: T_A[T_B[T_B[Char, Byte], T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B() => 1 
}
}