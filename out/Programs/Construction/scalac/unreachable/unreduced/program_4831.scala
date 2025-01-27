package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Int]
case class CC_B(a: T_A[T_A[(Byte,Int), Boolean], T_A[Boolean, Int]], b: CC_A[CC_A[Int]], c: T_A[T_A[Int, Int], Int]) extends T_A[T_A[(Byte,Int), Int], Int]

val v_a: T_A[T_A[(Byte,Int), Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}