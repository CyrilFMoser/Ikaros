package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[Int, T_B[Int, (Int,Byte)]]]
case class CC_B[F](a: (T_B[Char, Boolean],T_B[Char, Int]), b: T_B[F, F], c: T_A[F, F]) extends T_A[F, T_A[Int, T_B[Int, (Int,Byte)]]]
case class CC_C() extends T_A[T_B[CC_B[Int], CC_B[Boolean]], T_A[Int, T_B[Int, (Int,Byte)]]]

val v_a: T_A[T_B[CC_B[Int], CC_B[Boolean]], T_A[Int, T_B[Int, (Int,Byte)]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B((_,_), _, _) => 1 
  case CC_C() => 2 
}
}