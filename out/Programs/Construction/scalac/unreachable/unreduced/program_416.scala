package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Boolean], Int], b: T_A[T_A[Char, Boolean], T_A[Byte, Char]], c: T_A[T_A[Byte, Byte], Char]) extends T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, Int],(Int,Int))]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[CC_A, CC_A], Boolean]) extends T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, Int],(Int,Int))]
case class CC_C(a: (Byte,(CC_A,CC_A))) extends T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, Int],(Int,Int))]

val v_a: T_A[T_A[T_A[Char, Byte], Int], (T_A[Boolean, Int],(Int,Int))] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), _) => 1 
  case CC_C((_,_)) => 2 
}
}