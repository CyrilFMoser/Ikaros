package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: T_A[C, C]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], C]
case class CC_B() extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], (CC_A[(Int,Byte)],T_A[Byte, Int])]
case class CC_C[D](a: T_A[D, D], b: T_A[D, D]) extends T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], D]

val v_a: T_A[T_A[T_A[Boolean, Boolean], T_A[Boolean, Char]], (CC_A[(Int,Byte)],T_A[Byte, Int])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
}
}