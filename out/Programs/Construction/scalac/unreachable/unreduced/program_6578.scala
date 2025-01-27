package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: ((Boolean,(Int,Char)),T_B[Int]), b: (Byte,Char), c: T_B[(Byte,(Char,Char))]) extends T_A[T_B[Int]]
case class CC_B() extends T_A[T_B[Int]]
case class CC_C[C]() extends T_A[C]
case class CC_D() extends T_B[T_A[T_B[Int]]]
case class CC_E(a: T_A[T_B[CC_B]]) extends T_B[T_A[T_B[Int]]]

val v_a: T_A[T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (0,'x'), _) => 0 
  case CC_A(_, (0,_), _) => 1 
  case CC_A(_, (_,'x'), _) => 2 
  case CC_A(_, (_,_), _) => 3 
  case CC_B() => 4 
  case CC_C() => 5 
}
}