package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Int, Int], T_A[Int, Boolean]], b: T_A[T_A[Byte, Byte], T_A[Char, Boolean]], c: Byte) extends T_A[T_A[T_A[(Char,Int), Int], T_A[Int, Byte]], (T_A[Int, Int],T_A[Byte, Char])]
case class CC_B(a: CC_A) extends T_A[T_A[T_A[(Char,Int), Int], T_A[Int, Byte]], (T_A[Int, Int],T_A[Byte, Char])]

val v_a: T_A[T_A[T_A[(Char,Int), Int], T_A[Int, Byte]], (T_A[Int, Int],T_A[Byte, Char])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}