package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Char) extends T_A[T_A[T_A[Boolean, Int], Byte], (T_A[Byte, Int],T_A[Int, Char])]
case class CC_B(a: T_A[(CC_A,CC_A), T_A[(Byte,Int), CC_A]], b: T_A[Int, T_A[(Char,Boolean), CC_A]], c: CC_A) extends T_A[T_A[T_A[Boolean, Int], Byte], (T_A[Byte, Int],T_A[Int, Char])]
case class CC_C(a: (CC_B,CC_A), b: Boolean) extends T_A[T_A[T_A[Boolean, Int], Byte], (T_A[Byte, Int],T_A[Int, Char])]

val v_a: T_A[T_A[T_A[Boolean, Int], Byte], (T_A[Byte, Int],T_A[Int, Char])] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
  case CC_A(_) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _) => 3 
}
}