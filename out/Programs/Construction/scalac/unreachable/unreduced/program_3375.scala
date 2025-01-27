package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[T_B[Int, Boolean], (Int,Char)], T_A[T_A[Byte, Int], T_B[Boolean, Boolean]]]
case class CC_B(a: CC_A, b: T_A[CC_A, Int], c: T_A[CC_A, (CC_A,Int)]) extends T_A[T_B[T_B[Int, Boolean], (Int,Char)], T_A[T_A[Byte, Int], T_B[Boolean, Boolean]]]

val v_a: T_A[T_B[T_B[Int, Boolean], (Int,Char)], T_A[T_A[Byte, Int], T_B[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), _, _) => 1 
}
}