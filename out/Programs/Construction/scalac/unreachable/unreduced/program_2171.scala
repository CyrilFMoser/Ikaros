package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[(Byte,Int), Int],T_A[Int, Byte]), b: C) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Char]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Char]], D]
case class CC_C(a: CC_B[(Char,Byte)]) extends T_A[T_A[T_A[Byte, Byte], T_A[Byte, Char]], T_A[Boolean, CC_A[Int]]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Byte, Char]], T_A[T_A[T_A[Byte, Byte], T_A[Byte, Char]], T_A[Boolean, CC_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A((_,_), _)) => 0 
  case CC_A(_, CC_B()) => 1 
  case CC_A(_, CC_C(CC_B())) => 2 
  case CC_B() => 3 
}
}