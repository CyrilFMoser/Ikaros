package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A(a: T_A[T_A[Byte, (Char,Byte)], T_A[Byte, Int]], b: T_A[(Boolean,Boolean), (Char,Int)], c: Boolean) extends T_A[T_A[T_A[Byte, Byte], T_A[Int, Byte]], T_A[T_A[Int, Char], Boolean]]
case class CC_B(a: CC_A, b: Int) extends T_A[T_A[T_A[Byte, Byte], T_A[Int, Byte]], T_A[T_A[Int, Char], Boolean]]
case class CC_C() extends T_A[T_A[T_A[Byte, Byte], T_A[Int, Byte]], T_A[T_A[Int, Char], Boolean]]

val v_a: T_A[T_A[T_A[Byte, Byte], T_A[Int, Byte]], T_A[T_A[Int, Char], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_C() => 2 
}
}