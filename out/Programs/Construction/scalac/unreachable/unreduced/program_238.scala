package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[((Int,Byte),Boolean), Byte], b: CC_A[T_A[Int, Int]]) extends T_A[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]]]
case class CC_C[D]() extends T_A[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]], T_A[T_A[Boolean, Byte], T_A[T_A[Boolean, Byte], T_A[Boolean, Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _)) => 1 
  case CC_A(CC_C()) => 2 
  case CC_B(_, CC_A(_)) => 3 
  case CC_C() => 4 
}
}