package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: Byte, b: Byte, c: T_A[T_A[Char, Boolean], T_A[Boolean, Int]]) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[(Boolean,Int), Boolean], T_A[Int, Int]]]
case class CC_B(a: Byte, b: Boolean) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[(Boolean,Int), Boolean], T_A[Int, Int]]]
case class CC_C[C](a: Byte) extends T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[(Boolean,Int), Boolean], T_A[Int, Int]]]

val v_a: T_A[T_A[T_A[Int, Byte], T_A[Boolean, Byte]], T_A[T_A[(Boolean,Int), Boolean], T_A[Int, Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}