package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C, c: T_A[T_A[C, C], C]) extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], C]
case class CC_B() extends T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], (CC_A[Char],T_A[Int, (Byte,Byte)])]

val v_a: T_A[T_A[T_A[Byte, Int], T_A[Boolean, Int]], (CC_A[Char],T_A[Int, (Byte,Byte)])] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(_, _, _),_), _) => 0 
  case CC_B() => 1 
}
}