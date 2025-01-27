package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B() extends T_A[T_A[T_A[Boolean, (Int,Byte)], T_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, (Int,Byte)]]], T_A[T_A[T_A[Boolean, (Int,Byte)], T_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, (Int,Byte)]]], T_A[T_A[Boolean, (Int,Byte)], T_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, (Int,Byte)]]]]]

val v_a: T_A[T_A[T_A[Boolean, (Int,Byte)], T_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, (Int,Byte)]]], T_A[T_A[T_A[Boolean, (Int,Byte)], T_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, (Int,Byte)]]], T_A[T_A[Boolean, (Int,Byte)], T_A[T_A[Boolean, (Int,Byte)], T_A[Boolean, (Int,Byte)]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_B())) => 1 
  case CC_A(CC_A(_, _), CC_B()) => 2 
  case CC_B() => 3 
}
}