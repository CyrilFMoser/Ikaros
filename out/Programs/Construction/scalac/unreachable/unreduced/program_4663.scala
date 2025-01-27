package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Int, (Int,Byte)], Int], Int]
case class CC_B(a: T_A[Byte, CC_A], b: CC_A, c: T_A[CC_A, Char]) extends T_A[T_A[T_A[Int, (Int,Byte)], Int], Int]

val v_a: T_A[T_A[T_A[Int, (Int,Byte)], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}