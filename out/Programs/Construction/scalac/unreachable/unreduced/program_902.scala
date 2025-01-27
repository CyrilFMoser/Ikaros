package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A() extends T_A[T_A[T_A[Char, Byte], T_A[Int, Int]], Byte]
case class CC_B(a: T_A[T_A[Byte, Boolean], (CC_A,Int)], b: T_A[CC_A, (Boolean,CC_A)], c: Byte) extends T_A[T_A[T_A[Char, Byte], T_A[Int, Int]], Byte]

val v_a: T_A[T_A[T_A[Char, Byte], T_A[Int, Int]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, 0) => 1 
  case CC_B(_, _, _) => 2 
}
}