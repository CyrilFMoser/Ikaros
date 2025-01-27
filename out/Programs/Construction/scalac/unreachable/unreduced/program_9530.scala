package Program_21 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[CC_A[Int]], b: T_A[Int, T_A[Int, Int]]) extends T_A[T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]], T_A[T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]], T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]]]]
case class CC_C(a: CC_A[Byte], b: (CC_A[(Byte,Char)],Byte)) extends T_A[T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]], T_A[T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]], T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]]]]

val v_a: T_A[T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]], T_A[T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]], T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C(_, _) => 2 
}
}