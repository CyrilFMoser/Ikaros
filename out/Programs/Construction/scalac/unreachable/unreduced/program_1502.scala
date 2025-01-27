package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_A[Byte, (Byte,Byte)], Boolean]) extends T_A[(T_B[Char, Int],T_A[Byte, Boolean]), (T_B[Byte, Int],T_A[Int, Boolean])]
case class CC_B() extends T_A[(T_B[Char, Int],T_A[Byte, Boolean]), (T_B[Byte, Int],T_A[Int, Boolean])]
case class CC_C(a: CC_B) extends T_A[(T_B[Char, Int],T_A[Byte, Boolean]), (T_B[Byte, Int],T_A[Int, Boolean])]
case class CC_D[E, F]() extends T_B[E, F]

val v_a: T_A[(T_B[Char, Int],T_A[Byte, Boolean]), (T_B[Byte, Int],T_A[Int, Boolean])] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C(CC_B()) => 2 
}
}