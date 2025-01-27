package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Boolean, Byte], T_A[Int, Boolean]], T_A[T_A[Boolean, Int], Int]]
case class CC_B(a: T_A[CC_A, T_A[CC_A, CC_A]]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Int, Boolean]], T_A[T_A[Boolean, Int], Int]]
case class CC_C(a: T_A[T_A[CC_A, CC_A], Char]) extends T_A[T_A[T_A[Boolean, Byte], T_A[Int, Boolean]], T_A[T_A[Boolean, Int], Int]]

val v_a: T_A[T_A[T_A[Boolean, Byte], T_A[Int, Boolean]], T_A[T_A[Boolean, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_) => 2 
}
}