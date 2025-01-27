package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B(a: (T_A[Int],T_A[Byte]), b: T_B[T_B[Char, Byte], ((Char,Char),Char)]) extends T_B[CC_A[T_B[Char, Char]], T_A[T_A[Int]]]
case class CC_C() extends T_B[CC_A[T_B[Char, Char]], T_A[T_A[Int]]]
case class CC_D(a: T_A[Boolean], b: Int, c: ((CC_B,Char),T_A[(Char,Byte)])) extends T_B[CC_A[T_B[Char, Char]], T_A[T_A[Int]]]

val v_a: T_B[CC_A[T_B[Char, Char]], T_A[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(),CC_A()), _) => 0 
  case CC_C() => 1 
  case CC_D(CC_A(), _, _) => 2 
}
}